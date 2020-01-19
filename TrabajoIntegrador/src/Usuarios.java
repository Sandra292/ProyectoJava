
public abstract class Usuarios {
	private String nombre;
	private String apellido;
	protected String email;
	private Integer contraseña;
	private Integer puntaje;

	public Usuarios(String unNombre, String unApellido, String unEmail, Integer unaContraseña, Integer unPuntaje ) {
		nombre = unNombre;
		apellido = unApellido;
		email = unEmail;
		contraseña = unaContraseña;
		puntaje = unPuntaje;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", puntaje=" + puntaje
				+ "]";
	}

	public void jugar() {
		System.out.println("Estoy jugando");
	}
	
	
	
}
