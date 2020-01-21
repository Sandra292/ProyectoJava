package harry;


public abstract class Usuario {
	private String nombre;
	private String apellido;
	protected String email;
	private String contrasenia;
	private Integer puntajeTotal;

	

	public Usuario(String unNombre, String unApellido, String unEmail, String unaContraseña, Integer puntaje ) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.email = unEmail;
		this.contrasenia = unaContraseña;
		this.puntajeTotal = puntaje;
	
	}
	
	
	
	/*public Respuesta elegirRespuesta(Respuesta unaPregunta) {
		return unaPregunta;
		
		
	}*/
	
	
	
	

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
		return puntajeTotal;
	}

	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", puntaje=" + puntajeTotal
				+ "]";
	}

	
	
}
