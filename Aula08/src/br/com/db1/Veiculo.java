package br.com.db1;

public class Veiculo {
	private Moto moto;
	
	private Carro carro;
	
	private Marca marca;

	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Moto getMoto() {
		return moto;
	}
	
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
}
