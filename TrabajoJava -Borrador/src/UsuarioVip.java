
public class UsuarioVip extends Usuario  {

	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, String unaContraseņa, String unaEncuesta) {
		super(unNombre, unApellido, unEmail, unaContraseņa, puntaje);
		encuesta = unaEncuesta;
	}

}
