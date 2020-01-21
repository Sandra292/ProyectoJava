package harry;


public class UsuarioVip extends Usuario  {
	public static final int puntaje = 10;
	private String encuesta;

	public UsuarioVip(String unNombre, String unApellido, String unEmail, String unaContraseña, Integer puntaje) {
		super(unNombre, unApellido, unEmail, unaContraseña, puntaje);
		
	}


	

}

