import java.util.ArrayList;
import java.util.List;



public class Preguntas implements Jugables{
	
	private List<String> listaDePreguntas;
	private String pregunta;
	
	public  Preguntas(String unaPregunta) {
	this.pregunta = unaPregunta;
	this.listaDePreguntas = new ArrayList<String>();
	
	}

	
	public void agregarPregunta (String unaPregunta) {
		this.listaDePreguntas.add(unaPregunta);
	}
	
	
	public void jugar() {
		System.out.println("Generando Pregunta");
	}
	
	@Override
	public String toString() {
		return "Preguntas []";
	}


	public List<String> getListaDePreguntas() {
		return listaDePreguntas;
	}


	public String getPregunta() {
		return pregunta;
	}
	
	

	
}