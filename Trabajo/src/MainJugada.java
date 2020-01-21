
public class MainJugada {

	public MainJugada() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Pregunta primerPregunta = new Pregunta ();
		

				
		Respuesta unaRespuesta = new Respuesta();
		Partida unaPartida = new Partida();
		
		unaPartida.agregarJugables(primerPregunta);
		unaPartida.agregarJugables(unaRespuesta);
		
		UsuarioVip unUsuarioVip = new UsuarioVip ("Juan", "Perez", "juanp@hotmail.com", "A1234", "ok");
		unaPartida.agregarUsuario(unUsuarioVip);
		System.out.println(unUsuarioVip);
		System.out.println(unaPartida);
		
		unaPartida.jugar();
	}

}
