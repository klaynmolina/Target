package faturamento.diario_3;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Metodos {

	List<Dados> listaDados;
	List<Double> listaFaturamentos;

	Dados dado;
	Double faturamento;

	public List criarDado() {
		listaDados = new ArrayList<>();
		JSONParser jsonParser = new JSONParser();
		try {

			String caminho = "C:\\eclipse_IDE_Workspace\\ws-java\\Target\\src\\faturamento\\diario\\dados.json";

			JSONArray dadosArquivo = (JSONArray) jsonParser
					.parse(new InputStreamReader(new FileInputStream(caminho), "UTF-8"));
			for (Object o : dadosArquivo) {
				JSONObject d = (JSONObject) o;
				Integer dia = Integer.parseInt(d.get("dia").toString().replace(",", ""));
				Double valor = Double.parseDouble(d.get("valor").toString().replace(",", ""));

				dado = new Dados();
				dado.setDia(dia);
				dado.setValor(valor);
				listaDados.add(dado);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaDados;
	}

	public List criarFaturamento() {
		listaFaturamentos = new ArrayList<>();
		JSONParser jsonParser = new JSONParser();
		try {

			String caminho = "C:\\eclipse_IDE_Workspace\\ws-java\\Target\\src\\faturamento\\diario\\dados.json";

			JSONArray dadosArquivo = (JSONArray) jsonParser
					.parse(new InputStreamReader(new FileInputStream(caminho), "UTF-8"));
			for (Object o : dadosArquivo) {
				JSONObject d = (JSONObject) o;
				Double valor = Double.parseDouble(d.get("valor").toString().replace(",", ""));

				listaFaturamentos.add(valor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaFaturamentos;
	}

	public Double calculoMaiorFaturamento(List<Double> listaFaturamento) {
		double max = 0;
		for (double n : listaFaturamento) {
			if (max < n) {
				max = n;
			}
		}
		return max;
	}

	public Double calculoMenorFaturamento(List<Double> listaFaturamento, Double maiorFaturamento) {
		double min = maiorFaturamento;
		for (double n : listaFaturamento) {
			if (n != 0.0) {
				if (min > n) {
					min = n;
				}
			}
		}
		return min;
	}

	public Integer calculoValorSuperiorMediaMensal(List<Double> listaFaturamento) {
		double total = 0;
		double media;
		int diasUteis = 0;
		int diasMaiores = 0;

		for (double n : listaFaturamento) {
			total = total + n;
			if (n == 0.0) {
				diasUteis++;
			}
		}

		media = total / diasUteis;

		for (double n : listaFaturamento) {
			if (n > media) {
				diasMaiores++;
			}
		}

		return diasMaiores;
	}
}
