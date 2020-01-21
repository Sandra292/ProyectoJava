package harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Respuestas implements Jugables {
	
	public List<String> listaDeRespuestas;
	private String respuestaCorrecta;
	
	public  Respuestas(String Respuesta1, String Respuesta2, String Respuesta3, String unaRespuestaCorrecta) {

	this.listaDeRespuestas = new ArrayList<String>();
	this.listaDeRespuestas.add(Respuesta1);
	this.listaDeRespuestas.add(Respuesta2);
	this.listaDeRespuestas.add(Respuesta3);
	this.respuestaCorrecta = unaRespuestaCorrecta;
	
	}
	
	public void respuestaCorrecta(String unaRespuesta) {
		if(unaRespuesta.equals(this.respuestaCorrecta)  ) {
			System.out.println("Correcto");
			
		} else {
			System.out.println("Incorrecto");
		}
	}

	
	/*public void agregarRespuesta (String unaRespuesta) {
		this.listaDeRespuestas.add(unaRespuesta);
	}*/
	


	public List<String> getListaDeRespuestas() {
		return listaDeRespuestas;
	}


	
	

	@Override
	public String toString() {
		return "Respuestas []";
	}
	
	

}

