public class Conta {
	int numero;
	String nome;
	double limite;
	double valor;
	double deposido;
	double saldo;
	Cliente titular;

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}

	}

	void depositar(double quantidade) {	
		this.saldo = this.saldo + quantidade;

	}

	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);

		if (retirou == false) {
			return false;
		} else {
			destino.depositar(valor);
			return true;
		}

	}
}
