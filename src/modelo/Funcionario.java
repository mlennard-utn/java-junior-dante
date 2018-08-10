package modelo;

public class Funcionario {
	
	private double legajo;
	private String nombre;
	
	public String identificarse() {
		return String.format("Legajo: %f - Nombre: %s", this.legajo, this.nombre);
	}
	
	public double getLegajo() {
		return legajo;
	}
	
	public void setLegajo(double legajo) {
		this.legajo = legajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
