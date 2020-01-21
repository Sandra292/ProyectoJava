package harry;



import java.util.ArrayList;
import java.util.List;

public class Partida {
	private Usuario usuario;
	private List<Pregunta> listaDePreguntas;
	private Integer puntaje;
	
	

	public Partida(Usuario unUsuario, Integer unPuntaje) {
	
		this.listaDePreguntas = new ArrayList<Pregunta>();
		/*this.listaDePreguntas.add("¿Qué tipo de elfo era Dobby?");
		this.listaDePreguntas.add("¿Qué tipo de mapa es el que usan Harry y sus amigos en el tercer libro?");*/
		this.usuario = unUsuario;
		this.puntaje = unPuntaje ;	
		
		
			}
	
	
	public void mostrarPregunta(Pregunta unaPregunta) {
		
		this.listaDePreguntas.add(unaPregunta);
	}
	
	public void mostrarRespuestaCorrecta(Respuesta unaRespuesta) {
		
		System.out.println(unaRespuesta);
		
	}


	public Usuario getUsuario() {
		return usuario;
	}



	public Integer getPuntaje() {
		return puntaje;
	}


	
	
	

	
	
	
	
	


	
	
}

