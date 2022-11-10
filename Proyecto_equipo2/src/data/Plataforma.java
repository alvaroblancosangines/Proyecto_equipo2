package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Plataforma {
	// Atributos:
	private String nombre;
	private ArrayList<Editora> listaEditoras;
	private ArrayList<Videojuego> listaVideojuegos;
	
	
	// Constructores:
	public Plataforma() {
		listaEditoras = new ArrayList<Editora>();
		listaVideojuegos = new ArrayList<Videojuego>();
	}
	
	public Plataforma(String nombre, ArrayList<Editora> listaEditoras, ArrayList<Videojuego> listaVideoJuegos) {
		this.nombre = nombre;
		this.listaEditoras = listaEditoras;
		this.listaVideojuegos = listaVideoJuegos;
	}

	
	// Getters y Setters:
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre;  }

	public ArrayList<Editora> getListaEditoras() { return listaEditoras; }
	public void setListaEditoras(ArrayList<Editora> listaEditoras) { this.listaEditoras = listaEditoras; }

	public ArrayList<Videojuego> getListaJuegos() { return listaVideojuegos; }
	public void setListaJuegos(ArrayList<Videojuego> listaJuegos) { this.listaVideojuegos = listaJuegos; }

	
	// toString:
	@Override
	public String toString() {
		return "Plataforma [Nombre: " + nombre + ", Editoras: " + listaEditoras + ", Videojuegos: " + listaVideojuegos + "]";
	}
	
	
	// Altas:
	public void altaVideojuego(Videojuego v) {
		listaVideojuegos.add(v);
	}
	
	public void altaEditora(Editora e) {
		listaEditoras.add(e);
	}
	
	
	public void iniciarLucaSteam() {
		this.nombre = "LucaSteam";
		
		try {
			FileReader fr = new FileReader("");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
