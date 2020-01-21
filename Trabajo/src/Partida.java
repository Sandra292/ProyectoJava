import java.util.ArrayList;
import java.util.List;

public class Partida {
	private List <Usuario> listaDeUsuarios;
	private List <Jugable> listaDeJugables;
	
	

	public Partida() {
		this.listaDeUsuarios = new ArrayList <Usuario>();
		this.listaDeJugables = new ArrayList <Jugable>();
		
			}
	
	public void agregarUsuario(Usuario unUsuario) {
		this.listaDeUsuarios.add(unUsuario);
	}
	
	
	public void agregarJugables(Jugable unJugable) {
		this.listaDeJugables.add(unJugable);
	}
	
	public void jugar() {
		for(int i = 0;  i < listaDeUsuarios.size(); i++) {
			Usuario unUsuario = listaDeUsuarios.get(i);
			unUsuario.jugar();
		}
			for(int i = 0;  i < listaDeJugables.size(); i++) {
			Jugable unJugable = listaDeJugables.get(i);
			unJugable.jugar();
		}
			


}

	@Override
	public String toString() {
		return "Partidas [listaDeUsuarios=" + listaDeUsuarios + ", listaDeJugables=" + listaDeJugables + "]";
	}

	public List<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public List<Jugable> getListaDeJugables() {
		return listaDeJugables;
	}
	
	
	
	
}
	


