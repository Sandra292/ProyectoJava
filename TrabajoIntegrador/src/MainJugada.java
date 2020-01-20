
public class MainJugada {



	public static void main(String[] args) {
		
		Preguntas primerPregunta = new Preguntas("como te llamas");
		
				
		Respuestas unaRespuesta = new Respuestas();
		Partidas unaPartida = new Partidas();
		
		unaPartida.agregarJugables(primerPregunta);
		unaPartida.agregarJugables(unaRespuesta);
		
		UsuarioVip unUsuarioVip = new UsuarioVip ("Juan", "Perez", "juanp@hotmail.com", 1234, "ok");
		unaPartida.agregarUsuario(unUsuarioVip);
		System.out.println(unUsuarioVip);
		System.out.println(unaPartida);
		
		unaPartida.jugar();
	}

}
