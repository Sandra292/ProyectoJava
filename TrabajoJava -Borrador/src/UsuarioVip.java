
public class UsuarioVip extends Usuario  {

	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, String unaContraseña, String unaEncuesta) {
		super(unNombre, unApellido, unEmail, unaContraseña, puntaje);
		encuesta = unaEncuesta;
	}

}
