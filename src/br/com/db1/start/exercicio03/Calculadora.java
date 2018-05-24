package br.com.db1.start.exercicio03;

public class Calculadora {

	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;

	public void zerarCalculo() {
		primeiroValor = 0d;
		segundoValor = 0d;
	}

	public void somar(Double primeiroValor, Double segundoValor) {

	}

	public void subtrair(Double primeiroValor, Double segundoValor) {

	}

	public void dividir(Double primeiroValor, Double segundoValor) {

	}

	public void multiplicar(Double primeiroValor, Double segundoValor) {

	}

	public Double exibirResultado() {
		return resultado;
	}

	public Calculadora() {

	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

}
