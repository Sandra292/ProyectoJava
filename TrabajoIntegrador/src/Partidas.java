import java.util.ArrayList;
import java.util.List;

public class Partidas {
	private List <Usuarios> listaDeUsuarios;
	private List <Jugables> listaDeJugables;
	
	

	public Partidas() {
		this.listaDeUsuarios = new ArrayList <Usuarios>();
		this.listaDeJugables = new ArrayList <Jugables>();
		
			}
	
	public void agregarUsuario(Usuarios unUsuario) {
		this.listaDeUsuarios.add(unUsuario);
	}
	
	
	public void agregarJugables(Jugables unJugable) {
		this.listaDeJugables.add(unJugable);
	}
	
	public void jugar() {
		for(int i = 0;  i < listaDeUsuarios.size(); i++) {
			Usuarios unUsuario = listaDeUsuarios.get(i);
			unUsuario.jugar();
		}
			for(int i = 0;  i < listaDeJugables.size(); i++) {
			Jugables unJugable = listaDeJugables.get(i);
			unJugable.jugar();
		}
			


}

	@Override
	public String toString() {
		return "Partidas [listaDeUsuarios=" + listaDeUsuarios + ", listaDeJugables=" + listaDeJugables + "]";
	}
	
	
}

