class Kaelum {

	public static void main(String[] args) {

		for (int i = 0; i <= 1; i++) {
			System.out.println("Estou no capitulo 4 " + i);
		}

		Conta minhaconta;
		minhaconta = new Conta();

		minhaconta.nome = "juvenal";
		minhaconta.saldo = 1000.0;
		
		minhaconta.saca(200);
		minhaconta.depositar(500);
		
		
		Conta conta2;
		conta2 = new Conta();
		
		minhaconta.transferePara(conta2, 500);
		
		System.out.println("Saldo atual: " + minhaconta.saldo);
		System.out.println("saldo conta2: " + conta2.saldo);

	}

}
