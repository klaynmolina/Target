package percentual_4;

public class DadosFaturamento {

	static Double sp = 67836.43;
	static Double rj = 36678.66;
	static Double mg = 29229.88;
	static Double es = 27165.48;
	static Double outros = 19849.53;

	static Double totalFaturamento = sp + rj + mg + es + outros;

	static Double spPercentual = (sp / totalFaturamento) * 100;
	static Double rjPercentual = (rj / totalFaturamento) * 100;
	static Double mgPercentual = (mg / totalFaturamento) * 100;
	static Double esPercentual = (es / totalFaturamento) * 100;
	static Double outrosPercentual = (outros / totalFaturamento) * 100;

}
