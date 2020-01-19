
public abstract class Usuarios {
	private String nombre;
	private String apellido;
	protected String email;
	private Integer contraseņa;
	private Integer puntaje;

	public Usuarios(String unNombre, String unApellido, String unEmail, Integer unaContraseņa, Integer unPuntaje ) {
		nombre = unNombre;
		apellido = unApellido;
		email = unEmail;
		contraseņa = unaContraseņa;
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
