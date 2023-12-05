import java.util.Scanner;

public class Alumno {
    String prefijo_id = "ALUM";
    int numero_id;
    String id_alumno;
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

	public void setNombre(String nextLine) {
		this.nombre_alumno = nextLine;
	}

	public void setPrimerApellido(String nextLine) {
		this.primer_apellido = nextLine;
	}

	public void setSegundoApellido(String nextLine) {
		this.segundo_apellido = nextLine;
	}

	public void setTlf(int nextInt) {
		this.tlf = nextInt;
	}

	public void setEmail(String nextLine) {
		this.email = nextLine;
	}

	public void setNi(String nextLine) {
		this.ni = nextLine;
	}

	public void setNombre_ciclo(String nextLine) {
		this.nombre_ciclo = nextLine;
	}
}
