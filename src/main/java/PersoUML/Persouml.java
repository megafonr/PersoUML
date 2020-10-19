package PersoUML;

public class Persouml {

	private String nombre;
	private String apellido;
	private long dni;

	public Persouml() {
		// TODO - implement Persouml.Persouml
		throw new UnsupportedOperationException();
	}
        
	/**
	 * 
	 * @param n
	 * @param a
	 * @param d
	 */
	public Persouml(String n, String a, long d) {
		// TODO - implement Persouml.Persouml
		this.nombre = n;
                this.apellido = a;
                this.dni = d;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
	public String getNombre() {
		return this.nombre;
	}
        
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return this.dni;
	}

	/**
	 * @param dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	private String mostrar() {
		// TODO - implement Persouml.mostrar
		System.out.println("Mostrar ");
	return "true";
        }
}