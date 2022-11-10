package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import model.Editora;
import model.Videojuego;

public interface Plataforma {
	public void altaVideojuego(Videojuego v);
	
	public List<Videojuego> altaVideojuegos();
		
	public void altaEditora(Editora e);
}
