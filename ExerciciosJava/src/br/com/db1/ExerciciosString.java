package br.com.db1;

public class ExerciciosString {
	private String[] respostas;
	private String resposta;
	private Integer resultado;
	private String[] vogais;

	public ExerciciosString() {
		resposta = null;
		resultado = null;
	}

	public String[] exibirRespostas() {
		return respostas;
	}

	public String exibirResposta() {
		return resposta;
	}

	public Integer exibirResultado() {
		return resultado;
	}

	public void letraGrande(String palavra) {
		resposta = palavra.toUpperCase();
		System.out.println(resposta);

	}

	public void letraPequena(String palavra) {
		resposta = palavra.toLowerCase();
		System.out.println(resposta);

	}

	public void db1Start(String palavra) {
		resultado = palavra.length();
		System.out.println(resultado);
	}

	public void db1StartEspaco(String palavra) {
		resultado = palavra.length();
		System.out.println("tem espaço " + resultado);

	}

	public void db1StartIgual(String palavra) {
		resposta = palavra.trim();
		resultado = palavra.length();
		System.out.println("igual o exercicio anterior " + resultado);
	}

	public void nomeCompleto(String palavra) {
		resposta = palavra.substring(0, 4);
		System.out.println(resposta);
	}

	public void nomeTerceiraLetra(String palavra) {
		resposta = palavra.substring(3, palavra.length());
		System.out.println(resposta);
	}

	public void nomeUltimasLetras(String palavra) {
		resposta = palavra.substring(10, palavra.length());
		System.out.println(resposta);
	}

	public void nomeCompletoSubstituir(String palavra) {
		resposta = palavra.replace(palavra.substring(0, 7), "Aluno");
		System.out.println(resposta);

	}

	public void separarPalavras(String palavra) {
		respostas = palavra.split(",");
		for (int i = 0; i < 3; i++) {
			System.out.println(respostas[i]);
		}

	}

	public void vogaisPalavra(String palavra) {
		palavra.toLowerCase();
		Integer vogais =0;
		for (int i = 0; i < palavra.length(); i++) {
			 
			char c = palavra.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais++;
			}
		}
		resultado = vogais;
		System.out.println("vogais: " + resultado);
		
	}
	public void aoContrario(String palavra) {
		resposta = new StringBuilder(palavra).reverse().toString();
		System.out.println(resposta);
	}
}
