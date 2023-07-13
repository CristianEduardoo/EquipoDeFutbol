package equipoDeFutbol;

public abstract class Persona {
	
	/**** VARIABLES ****/
	protected String nombre, apellido;
	protected int edad;
	
	
	/**** CONSTRUCTOR *****/
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	
	/**** GETTERS *****/
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	/***** ToString/DAMEDATOSGENERALES *****/
	
	@Override
	public String toString () {
		return "Nombre: " + nombre +"\nApellido: " + apellido + "\nEdad: " + edad;
	}
	
	/**** Metodo abstracto ****/
	public abstract String cualidades();
	//Obliga a que la clase se abstracta

}
