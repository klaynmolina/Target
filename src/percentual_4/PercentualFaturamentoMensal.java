package percentual_4;

public class PercentualFaturamentoMensal {	
	
	public static void main(String[] args) {
				
		System.out.printf("Percentutal SP: %.2f %% \n\n", DadosFaturamento.spPercentual);
		
		System.out.printf("Percentutal RJ: %.2f %% \n\n", DadosFaturamento.rjPercentual);

		System.out.printf("Percentutal MG: %.2f %% \n\n", DadosFaturamento.mgPercentual);

		System.out.printf("Percentutal ES: %.2f %% \n\n", DadosFaturamento.esPercentual);

		System.out.printf("Percentutal OUTROS: %.2f %%", DadosFaturamento.outrosPercentual);

	}
	

}
