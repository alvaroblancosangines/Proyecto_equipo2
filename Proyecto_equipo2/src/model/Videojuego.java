package model;

import java.time.LocalDate;

public class Videojuego {

	private String nombre;
	private LocalDate fecha;
	private Editora editora;
	
	public Videojuego() {
		
	}

	public Videojuego(String nombre, LocalDate fecha, Editora editora) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.editora = editora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", fecha=" + fecha + ", editora=" + editora + "]";
	}
	
	
}
