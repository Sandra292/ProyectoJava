
public class UsuarioVip extends Usuario  {

	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, String unaContrase�a, String unaEncuesta) {
		super(unNombre, unApellido, unEmail, unaContrase�a, puntaje);
		encuesta = unaEncuesta;
	}

}
