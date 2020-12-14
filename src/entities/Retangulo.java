package entities;

public class Retangulo {

	private Double largura;
	private Double altura;

	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	public double area() {
		return largura*altura;
	}
	public double perimetro() {
		return 2 * (altura + largura);
	}
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
}
