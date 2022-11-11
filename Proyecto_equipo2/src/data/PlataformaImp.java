package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Editora;
import model.Videojuego;

public class PlataformaImp implements Plataforma {
	// Atributos:
	private String nombre;
	private ArrayList<Editora> listaEditoras;
	private ArrayList<Videojuego> listaVideojuegos;

	// Constructores:
	public PlataformaImp() {
		listaEditoras = new ArrayList<Editora>();
		listaVideojuegos = new ArrayList<Videojuego>();
	}

	public PlataformaImp(String nombre, ArrayList<Editora> listaEditoras, ArrayList<Videojuego> listaVideoJuegos) {
		this.nombre = nombre;
		this.listaEditoras = listaEditoras;
		this.listaVideojuegos = listaVideoJuegos;
	}

	// Getters y Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Editora> getListaEditoras() {
		return listaEditoras;
	}

	public void setListaEditoras(ArrayList<Editora> listaEditoras) {
		this.listaEditoras = listaEditoras;
	}

	public ArrayList<Videojuego> getListaJuegos() {
		return listaVideojuegos;
	}

	public void setListaJuegos(ArrayList<Videojuego> listaJuegos) {
		this.listaVideojuegos = listaJuegos;
	}

	// toString:
	@Override
	public String toString() {
		return "Plataforma [Nombre: " + nombre + ", Editoras: " + listaEditoras + ", Videojuegos: " + listaVideojuegos
				+ "]";
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

	public List<Videojuego> altaVideojuegos() {
		/*
		 * FileReader listaVideojuegos = null; String videojuego = null; Videojuego
		 * juego = null; try { listaVideojuegos = new FileReader("vgsales.csv");
		 * BufferedReader br = new BufferedReader(listaVideojuegos);
		 * 
		 * while((videojuego = br.readLine()) != null) { juego = sc.next();
		 * listaVideojuegos.add(juego); }
		 * 
		 * sc.close(); }catch(Exception ex) {}
		 */

		return null;

	}

	// Esto es un ejemplo
	public static List<String> almacenarCSV(String ubicar) {
		List<String> meterCosas = new ArrayList<>();
		File file = new File(ubicar);
		if (!file.exists()) {
			System.err.println("Este fichero no existe");

		} else {
			FileReader fileReader = null;
			BufferedReader bufferLectura = null;
			try {
				fileReader = new FileReader(file);
				bufferLectura = new BufferedReader(fileReader);
				String linea = bufferLectura.readLine();
				while (linea != null) {
					String[] trozos = linea.split(",");
					meterCosas.add(Arrays.toString(trozos));
					linea = bufferLectura.readLine();
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (bufferLectura != null) {
					try {
						bufferLectura.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}

		return meterCosas;
	}

	@Override
	public void altaVideojuego(VideojuegoImp v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void altaEditora(EditoraImp e) {
		// TODO Auto-generated method stub

	}
}
