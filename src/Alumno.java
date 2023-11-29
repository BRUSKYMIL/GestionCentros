import java.util.Scanner;

public class Alumno {
    String id_alumno = "ALUM0001";
    String nombre_alumno;
    String primer_apellido;
    String segundo_apellido;
    int tlf;
    String email;
    String ni;
    String nombre_ciclo;

    public Alumno() {
    }

    private String generarIdAlumno() {
        return id_alumno;
    }

    public String getNombreAlumno() {
        return nombre_alumno;
    }
    
    public String getPrimerApellidoAlumno() {
        return primer_apellido;
    }
    
    public String getSegundoApellidoAlumno() {
        return segundo_apellido;
    }
    
    public int getTlfAlumno() {
        return tlf;
    }
    
    public String getEmailAlumno() {
        return email;
    }
    
    public String getNiAlumno() {
        return ni;
    }
    
    public String getCicloAlumno() {
        return nombre_ciclo;
    }
    
    
    public void agregarAlumno() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        this.nombre_alumno = teclado.nextLine();
        System.out.print("Primer apellido: ");
        this.primer_apellido = teclado.nextLine();
        System.out.print("Segundo apellido: ");
        this.segundo_apellido = teclado.nextLine();
        System.out.print("Teléfono: ");
        this.tlf = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Email: ");
        this.email = teclado.nextLine();
        System.out.print("NIF/NIE: ");
        this.ni = teclado.nextLine();
        System.out.print("Nombre del ciclo (opcional): ");
        this.nombre_ciclo = teclado.nextLine();
        
    }
}
