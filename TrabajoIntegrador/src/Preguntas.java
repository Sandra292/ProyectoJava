import java.util.ArrayList;
import java.util.List;



public class Preguntas implements Jugables{
	
	private List<Preguntas> listaDePreguntas;
	private String pregunta;
	
	public  Preguntas(String unaPregunta) {
	this.pregunta = unaPregunta;
	this.listaDePreguntas = new ArrayList<Preguntas>();
	
	}

	
	public void agregarPregunta (Preguntas unaPregunta) {
		this.listaDePreguntas.add(unaPregunta);
	}
	
	
	public void jugar() {
		System.out.println("Generando Pregunta");
	}
	
	@Override
	public String toString() {
		return "Preguntas []";
	}


	public List<Preguntas> getListaDePreguntas() {
		return listaDePreguntas;
	}
	
	

	
}