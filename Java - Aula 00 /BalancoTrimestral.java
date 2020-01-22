// Exercicio pag 18 - 3.3
import java.text.DecimalFormat;

class BalancoTrimestral {
	public static void main(String []args){
		int gastosTrimestre = 0;
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Valor total de gastos: " + gastosTrimestre);

		double mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da média mensal: " + mediaMensal);

		// Para formatar o número, temos 2 opções:
		// 1: 
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		System.out.println(decimalFormat.format(mediaMensal)); 

		// (Lembra o C) Parece que só funciona com o 'f', pesquisar o pq - 2: 
		System.out.println(String.format("%.2f", mediaMensal));
	}
}
