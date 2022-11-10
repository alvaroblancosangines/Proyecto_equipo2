package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class PlataformaImp  implements Plataforma {
	// Atributos:
	private String nombre;
	private ArrayList<EditoraImp> listaEditoras;
	private ArrayList<VideojuegoImp> listaVideojuegos;
	
	
	// Constructores:
	public PlataformaImp() {
		listaEditoras = new ArrayList<EditoraImp>();
		listaVideojuegos = new ArrayList<VideojuegoImp>();
	}
	
	public PlataformaImp(String nombre, ArrayList<EditoraImp> listaEditoras, ArrayList<VideojuegoImp> listaVideoJuegos) {
		this.nombre = nombre;
		this.listaEditoras = listaEditoras;
		this.listaVideojuegos = listaVideoJuegos;
	}

	
	// Getters y Setters:
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public ArrayList<EditoraImp> getListaEditoras() { return listaEditoras; }
	public void setListaEditoras(ArrayList<EditoraImp> listaEditoras) { this.listaEditoras = listaEditoras; }

	public ArrayList<VideojuegoImp> getListaJuegos() { return listaVideojuegos; }
	public void setListaJuegos(ArrayList<VideojuegoImp> listaJuegos) { this.listaVideojuegos = listaJuegos; }

	
	// toString:
	@Override
	public String toString() {
		return "Plataforma [Nombre: " + nombre + ", Editoras: " + listaEditoras + ", Videojuegos: " + listaVideojuegos + "]";
	}
	
	
	// Altas:
	public void altaVideojuego(VideojuegoImp v) {
		listaVideojuegos.add(v);
	}
	
	public void altaEditora(EditoraImp e) {
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
