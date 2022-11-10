package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DaoPlataformaImp  implements DaoPlataforma {
	// Atributos:
	private String nombre;
	private ArrayList<DaoEditoraImp> listaEditoras;
	private ArrayList<DaoVideojuegoImp> listaVideojuegos;
	
	
	// Constructores:
	public DaoPlataformaImp() {
		listaEditoras = new ArrayList<DaoEditoraImp>();
		listaVideojuegos = new ArrayList<DaoVideojuegoImp>();
	}
	
	public DaoPlataformaImp(String nombre, ArrayList<DaoEditoraImp> listaEditoras, ArrayList<DaoVideojuegoImp> listaVideoJuegos) {
		this.nombre = nombre;
		this.listaEditoras = listaEditoras;
		this.listaVideojuegos = listaVideoJuegos;
	}

	
	// Getters y Setters:
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public ArrayList<DaoEditoraImp> getListaEditoras() { return listaEditoras; }
	public void setListaEditoras(ArrayList<DaoEditoraImp> listaEditoras) { this.listaEditoras = listaEditoras; }

	public ArrayList<DaoVideojuegoImp> getListaJuegos() { return listaVideojuegos; }
	public void setListaJuegos(ArrayList<DaoVideojuegoImp> listaJuegos) { this.listaVideojuegos = listaJuegos; }

	
	// toString:
	@Override
	public String toString() {
		return "Plataforma [Nombre: " + nombre + ", Editoras: " + listaEditoras + ", Videojuegos: " + listaVideojuegos + "]";
	}
	
	
	// Altas:
	public void altaVideojuego(DaoVideojuegoImp v) {
		listaVideojuegos.add(v);
	}
	
	public void altaEditora(DaoEditoraImp e) {
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
