package modelo;

public class Asistente extends Funcionario {
	
	private double legajoJefe;  

	public void asignarJefe(double jefeAQuienLoAsigno) {
		this.legajoJefe = jefeAQuienLoAsigno;
	}
	
	public double getLegajoJefe(){
		return this.legajoJefe;
	}
	
	public boolean estaLibre() {
		if(this.legajoJefe > 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
