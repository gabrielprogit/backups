package br.com.db1;

public class Carro extends Veiculo {
		
	private Motor motor;
	private Volante volante;
	private Pneu pneu;

	Carro(Motor motor, Volante volante, Pneu pneu){
		this.motor = motor;
		this.volante = volante;
		this.pneu = pneu;
			
		
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	 
	
	
}
