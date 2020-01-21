package harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Partidas {
	private List <Usuarios> listaDeUsuarios;

	
	

	public Partidas() {
		this.listaDeUsuarios = new ArrayList <Usuarios>();
		
		
			}
	
	public void agregarUsuario(Usuarios unUsuario) {
		this.listaDeUsuarios.add(unUsuario);
	}
	
	
	
	
	public void jugar() {
		for(int i = 0;  i < listaDeUsuarios.size(); i++) {
			Usuarios unUsuario = listaDeUsuarios.get(i);
			unUsuario.jugar();
		}
			}


}

	@Override
	public String toString() {
		return "Partidas [listaDeUsuarios=" + listaDeUsuarios + ", listaDeJugables=" + listaDeJugables + "]";
	}
	
	
}

