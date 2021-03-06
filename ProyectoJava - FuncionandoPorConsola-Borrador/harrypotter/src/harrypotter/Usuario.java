package harrypotter;


public abstract class Usuarios {
	private String nombre;
	private String apellido;
	protected String email;
	private Integer contraseņa;
	private Integer puntaje;

	public Usuarios(String unNombre, String unApellido, String unEmail, Integer unaContraseņa, Integer unPuntaje ) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.email = unEmail;
		this.contraseņa = unaContraseņa;
		this.puntaje = unPuntaje;
		
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

	
	
}
