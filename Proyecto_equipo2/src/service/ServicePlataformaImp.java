package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import data.EditoraImp;
import data.Videojuego;

public class ServicePlataformaImp {

	// Atributos:
		private String nombre;
		private ArrayList<EditoraImp> listaEditoras;
		private ArrayList<Videojuego> listaVideojuegos;
		
		
		// Constructores:
		public ServicePlataformaImp() {
			listaEditoras = new ArrayList<EditoraImp>();
			listaVideojuegos = new ArrayList<Videojuego>();
		}
		
		public ServicePlataformaImp(String nombre, ArrayList<EditoraImp> listaEditoras, ArrayList<Videojuego> listaVideoJuegos) {
			this.nombre = nombre;
			this.listaEditoras = listaEditoras;
			this.listaVideojuegos = listaVideoJuegos;
		}

		
		// Getters y Setters:
		public String getNombre() { return nombre; }
		public void setNombre(String nombre) { this.nombre = nombre; }

		public ArrayList<EditoraImp> getListaEditoras() { return listaEditoras; }
		public void setListaEditoras(ArrayList<EditoraImp> listaEditoras) { this.listaEditoras = listaEditoras; }

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
