package harry;

public class Respuesta  {
	
	private String pregunta;
	private Boolean respuestaCorrecta;
	

	public Respuesta(String unaPregunta, Boolean unaRespuesta) {
	
		this.pregunta = unaPregunta;
		this.respuestaCorrecta =  unaRespuesta;
		
		
			}
	
	
	
	
	public boolean respuestaCorrecta(String unaRespuesta) {
		if(unaRespuesta.equals(this.respuestaCorrecta)  ) {
			System.out.println("Correcto");
			return true;
			
		} else {
			System.out.println("Incorrecto");
			return false;
		}
	}




	public String getPregunta() {
		return pregunta;
	}
	
	





}

