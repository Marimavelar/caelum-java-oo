class HelloWorld {
	public static void main(String []args){
		// Imprimindo um texto com quebra de linha
		// Para imprimir sem linha, usar apenas print invés de println
		System.out.println("Hello World");

		// criando uma variável qualquer como int e imprindo na tela
		// lembrando que não é boa prática colocar nomes sem sentidos para variáveis, como "x"
		int x = 20;
		System.out.println(x);
		
		// criando uma variável string
		String s = "Olá";
		System.out.println(s);

		char c = 'C';
		System.out.println(c);

		// Para declarar uma variável como float, devemos colocar um F após o número pois um numero decimal em JAVA sempre é double
		float salarioJunior = 2500.00F;
		double salarioPleno = 4000.00;

		// Forçando um casting de um tipo para outro em casos que forem necessários
		short numeroShort = 5;
		byte numeroByte = (byte)numeroShort;

	}
}
