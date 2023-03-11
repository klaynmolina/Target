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
						
		System.out.printf("\nMENOR FATURAMENTO DO MÊS: R$ %.4f", menorFaturamento);
		System.out.println();		
		
		System.out.printf("\nMAIOR FATURAMENTO DO MÊS: R$ %.4f", maiorFaturamento);
		System.out.println();
		
		System.out.printf("\nNÚMERO DE DIAS EM QUE O FATURAMENTO DO MÊS FOI MAIOR QUE A MÉDIA MENSAL: %d", maiorFaturamentoMedia);
		System.out.println();
	}

}
