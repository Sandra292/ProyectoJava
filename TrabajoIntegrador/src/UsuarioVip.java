
public class UsuarioVip extends Usuarios  {

	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, Integer unaContrase�a, String unaEncuesta) {
		super(unNombre, unApellido, unEmail, unaContrase�a, puntaje);
		encuesta = unaEncuesta;
	}

}
