package equipoDeFutbol;

public class Futbolista extends Persona{
	
	/***** Variables Propias *****/
	private int dorsal;
	private String posicion;

	
	/***** CONSTRUCTOR ****/
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	
	/**** GETTERS ****/
	public int getDorsal() {
		return dorsal;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	
	/***** Sobre escribimos el método toString ******/
	
	@Override
	public String toString () {
		
		return "Los datos del futbolista son: \n" + super.toString();
		
	}
	
	/**** SOBRE ESCRIBIMOS EL METOTODO CUALIDADES DE LA CLASE PADRE(PERSONA) *****/
	
	@Override
	public String cualidades () {
		
		return "\nDorsal: " + dorsal + "\nPosición: " + posicion;
	}
	
}

	
