import java.util.Scanner;
import java.util.regex.Matcher;

public class MenuPrincipal {
	
	Profesor docente;
	Alumno estudiante;
	
	Profesor[] vectorProfesores;
	Alumno[] vectorAlumnos;
	boolean claseLlena;
	
	public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		Scanner teclado = new Scanner(System.in);
		
		boolean bucle_menu = true;
		do {
			System.out.println("\n\nBienvenido al software de gestión de centros educativos");
			System.out.println("--------------------------------------------");
			System.out.println("Por favor, escoja una de las opciones válidas:");
			System.out.println("--------------------------------------------");
			System.out.println("1. Menú de profesores.");
			System.out.println("2. Menú de asignaturas.");
			System.out.println("3. Menú de Alumno.");
			System.out.println("4. Salir del gestor.");
			System.out.println("--------------------------------------------");
			System.out.println("OPCIÓN:");
			int opcion = teclado.nextInt();
	            if(opcion == 1) {
	                menu.menuProfesor();
	            }
	            if(opcion == 2) {
	            	menu.menuAsignaturas();
	            }
	            if(opcion == 3) {
	            	menu.menuAlumno();
	            }
	            if(opcion == 4) {
	                System.out.println("Gracias por usar nuestro software.");
	        		System.out.println("CERRANDO...");
	        		bucle_menu = false;
	            }
		} while(bucle_menu);
	}
	
	
	public MenuPrincipal() {
		estudiante = new Alumno();
		this.vectorAlumnos = new Alumno[30];
		this.vectorProfesores = new Profesor[4];
	}
	
	private void menuProfesor() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Has seleccionado el Menú de Profesor");
        System.out.println("--------------------------------------------");
        System.out.println("Bienvenido al menú de Profesor");
    	System.out.println("--------------------------------------------");
    	System.out.println("Por favor, escoja una de las opciones válidas:");
    	System.out.println("--------------------------------------------");
    	System.out.println("1. Añadir profesor.");
    	System.out.println("2. Consultar datos.");
    	System.out.println("3. Volver.");
    	System.out.println("--------------------------------------------");
    	System.out.println("OPCIÓN:");
    	int opcion = teclado.nextInt();
    	if (opcion == 1) {
            registrarDatosProfesor();
    	}
    	if (opcion == 2) {
    		consultarDatosProfesor();
    	}
	}
	
	public void registrarDatosProfesor() {
		boolean atras = false;
		do {
			System.out.println("Para añadir un Profesor, necesitas introducir los siguientes parámetros");
			int huecoVectorProfesores = espacioVectorProfesores();
			Scanner teclado = new Scanner(System.in);
			
			if(huecoVectorProfesores<vectorProfesores.length) {
				Profesor nuevoProfesor = new Profesor();
		
		        System.out.print("Nombre del Profesor: ");
		        nuevoProfesor.setNombre( teclado.nextLine());
		        System.out.print("Primer apellido: ");
		        nuevoProfesor.setPrimerApellido(teclado.nextLine());
		        System.out.print("Segundo apellido: ");
		        nuevoProfesor.setSegundoApellido(teclado.nextLine());
		        System.out.print("Teléfono: ");
		        nuevoProfesor.setTlf(teclado.nextInt());
		        teclado.nextLine();
		        System.out.print("Email: ");
		        nuevoProfesor.setEmail(teclado.nextLine());
		        System.out.print("NIF/NIE: ");
		        nuevoProfesor.setNi(teclado.nextLine());
		        System.out.print("Nombre del ciclo (opcional): ");
		        nuevoProfesor.setNombre_ciclo(teclado.nextLine());
		        
				this.vectorProfesores[huecoVectorProfesores] = nuevoProfesor;
				System.out.println("\nProfesor agregado con éxito.\n\n");
			}
			else {
				System.out.println("\nLa clase está llena\n\n");
				claseLlena = true;
			}
			System.out.println("\n¿Desea continuar?");
			System.out.println("\nIntroduzca cualquier cosa para continuar.");
			System.out.println("Escriba 'Salir' para volver atrás.");
			if(teclado.nextLine().equalsIgnoreCase("Salir")) {
				atras = true;
			}
		}
		while(!atras);
	}
	
	private int espacioVectorProfesores() {
		int huecoVector = 0;
		for (int i = 0;i<vectorProfesores.length;i++) {
			if(vectorProfesores[i]== null) {
				huecoVector = i;
				break;
			}
		}
		return huecoVector;
	}
	
	private void consultarDatosProfesor() {
		boolean atras = false;
		do {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("\nSeleccione al Profesor:");
			mostrarProfesores();
			mostrarDatosProfesor();
			System.out.println("\n¿Desea continuar?");
			System.out.println("\nIntroduzca cualquier cosa para continuar.");
			System.out.println("Escriba 'Salir' para volver atrás.");
			if(teclado.nextLine().equalsIgnoreCase("Salir")) {
				atras = true;
			}
		}while(!atras);
	}
	
	private void mostrarProfesores() {
		for(int i=0;i<vectorProfesores.length;i++) {
			if(vectorProfesores[i] != null) {
				System.out.print((i+1)+". "+vectorProfesores[i].getNombreProfesor());
				System.out.println(" "+vectorProfesores[i].getPrimerApellidoProfesor());
			}
		}
		System.out.println("");
	}
	
	private void menuAsignaturas() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Has seleccionado el Menú de Asignaturas");
        System.out.println("--------------------------------------------");
        System.out.println("Bienvenido al menú de Asignaturas");
    	System.out.println("--------------------------------------------");
    	System.out.println("Por favor, escoja una de las opciones válidas:");
    	System.out.println("--------------------------------------------");
    	System.out.println("1. Añadir asignaturas.");
    	System.out.println("2. Consultar asignaturas.");
    	System.out.println("3. Asignar profesor a asignatura.");
    	System.out.println("4. Matricular alumno en asignatura.");
    	System.out.println("5. Poner nota alumno en la asignatura.");
    	System.out.println("6. Borrar asignatura.");
    	System.out.println("7. Desmatricular alumno de la asignatura.");
    	System.out.println("8. Volver.");
    	System.out.println("--------------------------------------------");
    	System.out.println("OPCIÓN:");
    	int opcion = teclado.nextInt();
    	if(opcion == 1) {
    		
    	}
    	if(opcion == 2) {
    		
    	}
    	if(opcion == 3) {
    		
    	}
    	if(opcion == 4) {
    		
    	}
    	if(opcion == 5) {
    		
    	}
    	if(opcion == 6) {
    		
    	}
    	if(opcion == 7) {
    		
    	}

	}
	
	private void mostrarDatosProfesor() {
		Scanner teclado = new Scanner(System.in);
		
		int numeroProfesor = teclado.nextInt();
		
		System.out.println("\nNombre: "+ vectorProfesores[numeroProfesor].getNombreProfesor());
		System.out.println("Primer apellido: "+ vectorProfesores[numeroProfesor].getPrimerApellidoProfesor());
		System.out.println("Segundo apellido: "+ vectorProfesores[numeroProfesor].getSegundoApellidoProfesor());
		System.out.println("Teléfono: "+ vectorProfesores[numeroProfesor].getTlfProfesor());
		System.out.println("NIE/NIF: "+ vectorProfesores[numeroProfesor].getNiProfesor());
		if(vectorProfesores[numeroProfesor].getCicloProfesor() != "") {
			System.out.println("Nombre del ciclo: "+ vectorProfesores[numeroProfesor].getCicloProfesor());
		}
		
	}
	
	private void menuAlumno() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Has seleccionado el Menú de Alumno");
        System.out.println("--------------------------------------------");
        System.out.println("Bienvenido al menú de Alumno");
    	System.out.println("--------------------------------------------");
    	System.out.println("Por favor, escoja una de las opciones válidas:");
    	System.out.println("--------------------------------------------");
    	System.out.println("1. Añadir alumno.");
    	System.out.println("2. Consultar datos.");
    	System.out.println("3. Volver.");
    	System.out.println("--------------------------------------------");
    	System.out.println("OPCIÓN:");
    	int opcion = teclado.nextInt();
    	if (opcion == 1) {
            registrarDatosAlumno();
    	}
    	if (opcion == 2) {
    		consultarDatosAlumno();
    	}
	}
	
	public void registrarDatosAlumno() {
		boolean atras = false;
		do {
			System.out.println("Para añadir un alumno, necesitas introducir los siguientes parámetros");
			int huecoVectorAlumnos = espacioVectorAlumnos();
			Scanner teclado = new Scanner(System.in);
			
			if(huecoVectorAlumnos<vectorAlumnos.length) {
				Alumno nuevoAlumno = new Alumno();
		
		        System.out.print("Nombre del alumno: ");
		        nuevoAlumno.setNombre( teclado.nextLine());
		        System.out.print("Primer apellido: ");
		        nuevoAlumno.setPrimerApellido(teclado.nextLine());
		        System.out.print("Segundo apellido: ");
		        nuevoAlumno.setSegundoApellido(teclado.nextLine());
		        System.out.print("Teléfono: ");
		        nuevoAlumno.setTlf(teclado.nextInt());
		        teclado.nextLine();
		        System.out.print("Email: ");
		        nuevoAlumno.setEmail(teclado.nextLine());
		        System.out.print("NIF/NIE: ");
		        nuevoAlumno.setNi(teclado.nextLine());
		        System.out.print("Nombre del ciclo (opcional): ");
		        nuevoAlumno.setNombre_ciclo(teclado.nextLine());
		        
				this.vectorAlumnos[huecoVectorAlumnos] = nuevoAlumno;
				System.out.println("\nAlumno agregado con éxito.\n\n");
			}
			else {
				System.out.println("\nLa clase está llena\n\n");
				claseLlena = true;
			}
			System.out.println("\n¿Desea continuar?");
			System.out.println("\nIntroduzca cualquier cosa para continuar.");
			System.out.println("Escriba 'Salir' para volver atrás.");
			if(teclado.nextLine().equalsIgnoreCase("Salir")) {
				atras = true;
			}
		}
		while(!atras);
	}
	
	private int espacioVectorAlumnos() {
		int huecoVector = 0;
		for (int i = 0;i<vectorAlumnos.length;i++) {
			if(vectorAlumnos[i]== null) {
				huecoVector = i;
				break;
			}
		}
		return huecoVector;
	}
	
	private void consultarDatosAlumno() {
		boolean atras = false;
		do {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("\nSeleccione al alumno:");
			mostrarAlumnos();
			mostrarDatosAlumno();
			System.out.println("\n¿Desea continuar?");
			System.out.println("\nIntroduzca cualquier cosa para continuar.");
			System.out.println("Escriba 'Salir' para volver atrás.");
			if(teclado.nextLine().equalsIgnoreCase("Salir")) {
				atras = true;
			}
		}while(!atras);
	}
	
	private void mostrarAlumnos() {
		for(int i=0;i<vectorAlumnos.length;i++) {
			if(vectorAlumnos[i] != null) {
				System.out.print((i+1)+". "+vectorAlumnos[i].getNombreAlumno());
				System.out.println(" "+vectorAlumnos[i].getPrimerApellidoAlumno());
			}
		}
		System.out.println("");
	}
	
	private void mostrarDatosAlumno() {
		Scanner teclado = new Scanner(System.in);
		
		int numeroAlumno = teclado.nextInt()-1;
		
		System.out.println("\nNombre: "+ vectorAlumnos[numeroAlumno].getNombreAlumno());
		System.out.println("Primer apellido: "+ vectorAlumnos[numeroAlumno].getPrimerApellidoAlumno());
		System.out.println("Segundo apellido: "+ vectorAlumnos[numeroAlumno].getSegundoApellidoAlumno());
		System.out.println("Teléfono: "+ vectorAlumnos[numeroAlumno].getTlfAlumno());
		System.out.println("NIE/NIF: "+ vectorAlumnos[numeroAlumno].getNiAlumno());
		if(vectorAlumnos[numeroAlumno].getCicloAlumno() != "") {
			System.out.println("Nombre del ciclo: "+ vectorAlumnos[numeroAlumno].getCicloAlumno());
		}
	}
}
