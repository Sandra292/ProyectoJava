package harrypotter;


import java.util.Scanner;
public class Main {

	
	


	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in); 
		
		
		/*Se crea la variable sc, para usar uno de sus métodos.
	    
 		unaPartida.agregarJugables(primerPregunta);
		unaPartida.agregarJugables(unaRespuesta);
		
		
	   	---------------------------------------------------------------------------------------------------
		Respuestas unaRespuesta = new Respuestas("Doméstico", "Bancario", "Volador", "Doméstico");
		Respuestas unaRespuesta2 = new Respuestas("Albus", "Inquisidor", "Merodeador", "Merodeador");
		Preguntas Pregunta1 = new Preguntas();
		Preguntas Pregunta2 = new Preguntas();
		
		System.out.println(Pregunta1.listaDePreguntas.get(0));
		System.out.println("A- "+ unaRespuesta.listaDeRespuestas.get(0) +"  B- "+ unaRespuesta.listaDeRespuestas.get(1)  +"  C- "+ unaRespuesta.listaDeRespuestas.get(2));
		String respuesta = sc.next();
		unaRespuesta.respuestaCorrecta(respuesta);
		*/
	  
		Partidas unaPartida = new Partidas();	
	    UsuarioVip unUsuarioVip = new UsuarioVip ("Juan", "Perez", "juanp@hotmail.com", 1234, "ok");
	    unaPartida.agregarUsuario(unUsuarioVip);
		System.out.println(unUsuarioVip);
		System.out.println(unaPartida);
		unaPartida.jugar();
		
		Respuestas unaRespuesta = new Respuestas("a", "b", "c", "a");
		Respuestas unaRespuesta2 = new Respuestas("albus","inquisidor","merodeador","merodeador");
		Preguntas Pregunta1 = new Preguntas();
		Preguntas Pregunta2 = new Preguntas();
		
		System.out.println(Pregunta1.listaDePreguntas.get(0));
		System.out.println(
		unaRespuesta.listaDeRespuestas.get(0) + " " +"Doméstico"+ " " +
		unaRespuesta.listaDeRespuestas.get(1) + " " +"Bancario"+ " " +
		unaRespuesta.listaDeRespuestas.get(2) + " " +"Volador");
		
		String respuesta = sc.next();
		respuesta = respuesta.toLowerCase();
			
		unaRespuesta.respuestaCorrecta(respuesta);
		
		System.out.println(Pregunta2.listaDePreguntas.get(1));
		String respuesta2= sc.next();
		respuesta2 =respuesta2.toLowerCase();
		
		unaRespuesta2.respuestaCorrecta(respuesta2);
		
		
		
	}

}

