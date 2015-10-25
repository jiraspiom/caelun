package exercicio1;

public class app {
	public static void main(String[] args) {

		int[] idade = new int[10];
		
		for (int i =0 ; i < 10 ; i++){
			idade[i] = i + 10;
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(" a idade é: " + idade[i]);
		}
		

		
		//inprimeArray(idade[]);

	}
	
	public void inprimeArray(int[] idade){
		
		for (int i = 0; i < idade.length ; i++){
			System.out.println("e " + idade[i]);
		}
		
	}
}
