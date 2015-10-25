package exercicio1;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String RG;

	void recebeAumento(double valor) {
		this.salario = this.salario + valor;
		
	}

	void calcularGanhoAnual() {
		this.salario = this.salario * 12;
		
	}

	double retornaAnual() {
		double valor = this.salario * 3;
		return valor;
	}
	
	void mostrar(){
		System.out.println("salario do ano é: " + this.salario);
		System.out.println("nome : " + this.nome);
	}
}
