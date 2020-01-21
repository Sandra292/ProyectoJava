package harry;

import java.util.ArrayList;
import java.util.List;



public class Pregunta {
	

	public List<Respuesta> listaDeRespuestas;
	private String pregunta;

	
	public  Pregunta(Respuesta Respuesta1, Respuesta Respuesta2, Respuesta Respuesta3, String unaPregunta) {

	this.listaDeRespuestas = new ArrayList<Respuesta>();
	this.listaDeRespuestas.add(Respuesta1);
	this.listaDeRespuestas.add(Respuesta2);
	this.listaDeRespuestas.add(Respuesta3);
	this.pregunta = unaPregunta;
	
	}


	public String getPregunta() {
		return pregunta;
	}
	
	
	
	
	
	
	

	
	



	
	
	

	
}