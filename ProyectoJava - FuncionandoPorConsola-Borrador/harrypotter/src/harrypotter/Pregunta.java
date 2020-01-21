package harrypotter;

import java.util.ArrayList;
import java.util.List;



public class Preguntas implements Jugables{
	
	public List<String> listaDePreguntas;

	
	public  Preguntas() {

	this.listaDePreguntas = new ArrayList<String>();
	this.listaDePreguntas.add("¿Qué tipo de elfo era Dobby?");
	this.listaDePreguntas.add("¿Qué tipo de mapa es el que usan Harry y sus amigos en el tercer libro?");
	
	
	}

	
	public void agregarPregunta (String unaPregunta) {
		this.listaDePreguntas.add(unaPregunta);
	}
	
	

	@Override
	public String toString() {
		return "Preguntas []";
	}


	public List<String> getListaDePreguntas() {
		return listaDePreguntas;
	}



	
	
	

	
}