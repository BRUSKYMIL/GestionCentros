import java.util.Scanner;
import java.util.regex.Matcher;

public class MenuPrincipal {
	
	Alumno estudiante;
	Alumno[] vectorAlumnos;
	boolean claseLlena;
	
	public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido al software de gestión de centros educativos");
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
		
		switch (opcion) {
            case 1:
            	Profesores profesores = new Profesores();
                System.out.println("Has seleccionado el Menú de profesores");
                break;
            case 2:
                System.out.println("Has seleccionado el Menú de asignaturas");
                break;
            case 3:
                menu.menuAlumno();
                break;
            case 4:
                System.out.println("Gracias por usar nuestro software.");
        		System.out.println("CERRANDO...");
                break;
            default:
                System.out.println("Opción no válida");
        }
	}
	public MenuPrincipal() {
		estudiante = new Alumno();
		this.vectorAlumnos = new Alumno[30];
	}
	
	public void menuAlumno() {
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
            System.out.println("Para añadir un alumno, necesitas introducir los siguientes parámetros");
            estudiante.agregarAlumno();
            registrarDatosAlumno();
    	}
    	if (opcion == 2) {
    		
    	}
	}
	
	public void registrarDatosAlumno() {
		Alumno nuevoAlumno = new Alumno();
		estudiante.getNombreAlumno();
		estudiante.getPrimerApellidoAlumno();
		estudiante.getSegundoApellidoAlumno();
		estudiante.getTlfAlumno();
		estudiante.getEmailAlumno();
		estudiante.getNiAlumno();
		estudiante.getCicloAlumno();
		int huecoVectorAlumnos = espacioVector();
		if(huecoVectorAlumnos > 0) {
			this.vectorAlumnos[huecoVectorAlumnos] = nuevoAlumno;
		}
		else {
			claseLlena = true;
		}
	}
	
	private int espacioVector() {
		int huecoVector = 0;
		for (int i = 0;i<vectorAlumnos.length;i++) {
			if(vectorAlumnos[i]== null) {
				huecoVector = i;
				break;
			}
		}
		return huecoVector;
	}
}
