package equipoDeFutbol;
import java.util.ArrayList;
import java.util.Scanner;
/*
 Crear un programa para simular un equipo de fútbol (futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:
  - Una Super Clase Persona: nombre, apellido y edad
  - Una Sub Clase Futbolista: dorsal y posición
  - Una Sub Clase Entrenador: tendrá de dato, la estrategia que utiliza
  - Una sub Clase Doctor: titulación y años de experiencia
 */

public class Principal {
	/****** CREAMOS UN ARREGLO DINAMICO/arraylist DE LA CLASE PERSONA, PORQUE VAMOS ALMACENAR JUGADORES, ENTRENADORES Y DOCTORES *********/
	/*** "POLIMORFIRMO" ***/
	
	static ArrayList <Persona> persona = new ArrayList <Persona>();
	
	/***** la clase Scanner General *****/
	static Scanner entrada = new Scanner (System.in);

	
	
	/****** MAIN *******/
	public static void main(String[] args) {
		
		llenarMenu ();
		mostraDatos ();

	} /******  FIN DEL MAIN *******/
	
	
	
	
	/******** CREAREMOS METODOS STATICOS PARA NO LLENAR TANTO EL MAIN *********/
	public static void llenarMenu() {
		String respuesta;
		int opcion;
			
	do {
		
		do {
			
			System.out.println("Digite la opción del menu");
			System.out.println("1. Entrenador");
			System.out.println("2. Jugador");
			System.out.println("3. Doctor");
			
			opcion = entrada.nextInt();
			
		}while (opcion < 1 || opcion > 3 );
		
		
		switch (opcion) {
		
			case 1:
					
					entrenador();
				
				break;
			
			
			case 2:
					
					jugadores();
				
				break;
			
			case 3:
				
				    doctor();
				    
				break;    
		}
		
		System.out.println("\n¿Desea introducir otra opción en su menu? si o no \n");
		respuesta = entrada.nextLine();  /* DUDA, PORQUE NO ES NEXTLINE??? */
		
	}while (respuesta.equalsIgnoreCase("si"));
		
	}  /******  FIN DEL METODO llenarMenu() *******/
	
	
	
	public static void entrenador() {
		
		String nombre, apellido, estrategia;
		int edad; 
		
		entrada.nextLine(); // problema del buffer
		
		System.out.println("\nDigite el nombre del Entrenador");
		nombre = entrada.nextLine();
	
		System.out.println("Digite el apellido");
		apellido = entrada.nextLine();
	
		System.out.println("Digite la edad");
		edad = entrada.nextInt();
		
		entrada.nextLine(); // problema del buffer
		
		System.out.println("Digite el estrategia del entrenador");
		estrategia = entrada.nextLine();
		
		/**** OBJETO ****/
		Entrenador coach = new Entrenador (nombre, apellido, edad, estrategia);
		
		/**** IMPORTANTE ARRAYLIST ***/
		persona.add(coach);
		
		
	}/*** FIN ***/
	

	
	
	
	public static void jugadores() {
		
		String nombre, apellido, posicion;
		int edad, dorsal; 
		
		entrada.nextLine(); // problema del buffer
		
		System.out.println("\nDigite el nombre  del futbolista");
			nombre = entrada.nextLine();
		
		System.out.println("Digite el apellido");
			apellido = entrada.nextLine();
		
		System.out.println("Digite la edad");
			edad = entrada.nextInt();
		
		System.out.println("Digite el dorsal del futbolista");
			dorsal = entrada.nextInt();	
			
		entrada.nextLine(); // problema del buffer
			
		System.out.println("Digite la posicion del futbolista");
			posicion = entrada.nextLine();
			
					
		Futbolista jugador = new Futbolista (nombre, apellido, edad, dorsal, posicion);
		
		/**** IMPORTANTE ARRAYLIST ***/
		 persona.add(jugador); //llamamos al arrayList para N JUGADORES, por el POLIMORFISMO podemos guardar dentro de la clase PERSONA un FUTBOLISTA 
		// almacenamos dentro del arreglo persona al Objeto jugador
		 
		 
	} /*** FIN ***/
	
	
	
	
	public static void doctor () {
		
		String nombre, apellido, titulacion;
		int edad;
		float ansExperiencia;
		
		entrada.nextLine(); // problema del buffer
		
		System.out.println("\nDigite el nombre  del Doctor");
		nombre = entrada.nextLine();
	
		System.out.println("Digite el apellido");
		apellido = entrada.nextLine();
		
		System.out.println("Digite la titulación");
		titulacion = entrada.nextLine();
	
		System.out.println("Digite la edad");
		edad = entrada.nextInt();
		
		System.out.println("Digite los años de experiencia");
		ansExperiencia = entrada.nextFloat();
		
		entrada.nextLine(); // problema del buffer
		
		Doctor doc = new Doctor (nombre, apellido, edad, titulacion, ansExperiencia);
		
		persona.add(doc);
	}
	
	
	public static void mostraDatos () { //Recorremos la clase padre/Persona
		
		for (Persona i:persona) { //poligono = arraylist
			
			System.out.println(i.toString());  // Gracias al Polimorfismo, Java sabe si llama al toString de Doctor ó Futbolista, etc
			System.out.println("Cuya cualidades son" + i.cualidades());  // lo mismo por el Polimorfismo
			System.out.println(" ");
		}
		
	}
	
	
	
	 

} 
