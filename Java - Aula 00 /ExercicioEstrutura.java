// Exercicio pag 28 - 3.13
class ExercicioEstruturas {
	public static void main(String args[]){
		// 1. Imprima todos os números de 150 a 300
		int numeros = 0;
		for(int i = 150; i <= 300; i++){
			System.out.print(i + " ");	
		}
		System.out.println("");
		
		// 2. Imprima a soma de 1 até 1000
		int soma = 0;
		for(int i = 0; i <= 1000; i++){
			soma += i;
			System.out.print(soma + " ");
		}	
		System.out.println("");

		// 3. Imprima todos os multíplos de 3, entre 1 e 100
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0){
				System.out.print(i + " ");
			}
		}	
		System.out.println("");

		// 4. Imprima os fatoriais de 1 a 10
		int fatorial = 1;
		for(int i = 1; i <= 10; i++){
			fatorial *= i;
		}
		System.out.println("O fatorial de 1 a 10 é: " + fatorial);

		// 5. Imprima os fatoriais de 1 a 40
		long fatorialLong = 1;
		for(long i = 1; i <= 20; i++){
			fatorialLong *= i;
		}
		System.out.println("O fatorial de 1 a 20 é: " + fatorialLong);
	}
}
