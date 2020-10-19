package PersoUML;

public class docenuml extends Persouml {

	private int legajo;
	private short antiguedad;

	/**
	 * 
	 * @param n
	 * @param a
	 * @param d
	 * @param l
	 * @param ant
	 */
	public docenuml(String n, String a, long d, int l, short ant) {
		// TODO - implement docenuml.docenuml
                super(n, a, d);
                this.legajo = l;
                this.antiguedad = ant;
	}

	/**
	 * 
	 * @param n
	 * @param a
	 * @param d
	 */
	public docenuml(String n, String a, long d) {
            super(n, a, d);
		// TODO - implement docenuml.docenuml
	}
        
	public int getLegajo() {
		return this.legajo;
	}

	/**
	 * @param legajo
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public short getAntiguedad() {
		return this.antiguedad;
	}

	/**
	 * @param antiguedad
	 */
	public void setAntiguedad(short antiguedad) {
		this.antiguedad = antiguedad;
	}

        public void mostrar() {
            System.out.println("Mostrar Docente Antig: " + this.antiguedad);
		// TODO - implement docenuml.mostrar
	}

}