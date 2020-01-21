
public abstract class Usuario {
	private String nombre;
	private String apellido;
	protected String email;
	private String contrase�a;
	private Integer puntaje;

	public Usuario(String unNombre, String unApellido, String unEmail, String unaContrase�a, Integer unPuntaje ) {
		nombre = unNombre;
		apellido = unApellido;
		email = unEmail;
		contrase�a = unaContrase�a;
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