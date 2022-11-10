package data;

import java.io.FileNotFoundException;
import java.io.FileReader;

public interface DaoPlataforma {
	public void altaVideojuego(DaoVideojuegoImp v);
		
	public void altaEditora(DaoEditoraImp e);
}
