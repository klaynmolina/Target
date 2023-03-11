package faturamento.diario_3;

import java.util.ArrayList;
import java.util.List;

public class FaturamentoDiario {

	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		Double maiorFaturamento;
		Double menorFaturamento;
		Integer maiorFaturamentoMedia;

		List<Double> listaFaturamentos = new ArrayList<>();
		
		listaFaturamentos = metodos.criarFaturamento();
		maiorFaturamento = metodos.calculoMaiorFaturamento(listaFaturamentos);
		menorFaturamento = metodos.calculoMenorFaturamento(listaFaturamentos, maiorFaturamento);
		maiorFaturamentoMedia = metodos.calculoValorSuperiorMediaMensal(listaFaturamentos);
						
		System.out.printf("\nMENOR FATURAMENTO DO M�S: R$ %.4f", menorFaturamento);
		System.out.println();		
		
		System.out.printf("\nMAIOR FATURAMENTO DO M�S: R$ %.4f", maiorFaturamento);
		System.out.println();
		
		System.out.printf("\nN�MERO DE DIAS EM QUE O FATURAMENTO DO M�S FOI MAIOR QUE A M�DIA MENSAL: %d", maiorFaturamentoMedia);
		System.out.println();
	}

}
