
public class Profesor {
	    String prefijo_id = "PROF";
	    int numero_id;
	    String id_profesor;
	    String nombre_profesor;
	    String primer_apellido;
	    String segundo_apellido;
	    int tlf;
	    String email;
	    String ni;
	    String nombre_ciclo;

	    public Profesor() {
	    }

	    private String generarIdprofesor() {
	    	
	        return id_profesor;
	    }

	    public String getNombreProfesor() {
	        return nombre_profesor;
	    }
	    
	    public String getPrimerApellidoProfesor() {
	        return primer_apellido;
	    }
	    
	    public String getSegundoApellidoProfesor() {
	        return segundo_apellido;
	    }
	    
	    public int getTlfProfesor() {
	        return tlf;
	    }
	    
	    public String getEmailProfesor() {
	        return email;
	    }
	    
	    public String getNiProfesor() {
	        return ni;
	    }
	    
	    public String getCicloProfesor() {
	        return nombre_ciclo;
	    }

		public void setNombre(String nextLine) {
			this.nombre_profesor = nextLine;
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