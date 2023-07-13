package equipoDeFutbol;

public class Doctor extends Persona{

	/***** Variables Propias *****/
	String titulacion;
	float ansExperiencia;
	
	
	/***** CONSTRUCTOR ****/
	public Doctor (String nombre, String apellido, int edad, String titulacion, Float ansExperiencia) {
		
		super(nombre, apellido, edad);
		
		this.titulacion = titulacion;
		this.ansExperiencia = ansExperiencia;
	}
	
	
	
	/**** GETTERS ****/
	public String getTitulacion() {
		
		return titulacion;
	}
	
	
	public float getAnsExperiencia () {
		
		return ansExperiencia;
	}
	
	
	/***** Sobre escribimos el método toString ******/
	
	@Override
	public String toString () {
		
		return "El doctor: \n" + super.toString();
	}
	
	
	@Override
	public String cualidades () {
		
		return "\nTitulación: " + titulacion + "\nAños de experiencia: " + ansExperiencia;
	}
}
