package model;

public class Editora {

	private String nombre;

	public Editora() {
	}

	public Editora(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Editora [nombre=" + nombre + "]";
	}
	
	
}
