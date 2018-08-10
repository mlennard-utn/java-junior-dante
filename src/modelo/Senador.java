package modelo;

public class Senador extends Funcionario {
	
	private String partido;
	private char provincia;
	private boolean decision;

	public Senador(char provinciaQueRepresenta) {
		super();
		this.provincia = provinciaQueRepresenta;
	}
	
	@Override
	public String identificarse() {
		return super.identificarse() + " - Provincia: " + this.provincia + " - Partido: " + this.partido;
	}

	public String informarVoto() {
		return null;
	}
	
	private void setDecision(boolean suDecision) {
		this.decision = suDecision;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public char getProvincia() {
		return this.provincia;
	}
	
	public boolean getDecision() {
		return this.decision;
	}
	
}
