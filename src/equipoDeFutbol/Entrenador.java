package equipoDeFutbol;

public class Entrenador extends Persona{
	
	/***** Variable Propias *******/
	String estrategia;
	
	
	
	/***** CONSTRUCTOR ****/
	public Entrenador (String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		
		this.estrategia = estrategia;
		
	}
	
	
	/**** GETTERS ****/
	public String getEstrategia () {
		
		return estrategia;
	}
	
	
	
	/***** Sobre escribimos el método toString ******/
	
	@Override
	public String toString() {
		
		return "El entrenador: \n" + super.toString(); 
	}
	
	
	@Override
	public String cualidades () { //Nos obliga a definir la clase abstracta
		
		return "\nEstrategia: " + estrategia;
	}
	
	
}
