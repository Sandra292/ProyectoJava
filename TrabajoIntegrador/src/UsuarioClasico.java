
public class UsuarioClasico extends Usuarios {
	public static final int puntaje = 5;

	public UsuarioClasico(String unNombre, String unApellido, String unEmail, Integer unaContraseña) {
		super(unNombre, unApellido, unEmail, unaContraseña, puntaje);
	}

}
