package harrypotter;


public class UsuarioVip extends Usuarios  {

	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, Integer unaContraseņa, String unaEncuesta) {
		super(unNombre, unApellido, unEmail, unaContraseņa, puntaje);
		encuesta = unaEncuesta;
	}

}

