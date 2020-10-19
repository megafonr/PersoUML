package PersoUML;
import java.util.ArrayList;

public class Alumuml extends Persouml {

	private int padron;
	ArrayList<Float> notaf;
        private Float promf;

        /**
	 * @param n : nombre
	 * @param a : apellido
	 * @param d : dni
	 * @param p : padron
	 */
    public Alumuml(String n, String a, long d, int p) {
	 super(n, a, d);

        notaf = new ArrayList();
        for (int i=1; i<=9; i++){
	notaf.add(((10/i)*1.0)); 
        }
        padron = p;
    }

	/**
	 * @param n
	 * @param a
	 * @param d
	 */
	public Alumuml(String n, String a, long d) {
            super(n, a, d);
            notaf = new ArrayList();
            for (int i=1; i<=9; i++){
                notaf.add(((10/i)*1.0)); 
            }

	}
  
	public int getPadron() {
		return padron;
	}

	/**
	 * @param padron
	 */
	public void setPadron(int padron) {
		this.padron = padron;
	}

	public Float getPromedio( ) {
           promf = Float.parseFloat("0");
            for (int i=0; i< this.notaf.size(); i++){
             promf = promf + this.notaf.get(i); 
            }
        return promf; 
	}

	/**
	 * 
	 * @param notas
	 */ 
	public void setNotas(Float notas) {
		notaf.add(notas);
	}

	private void mostrar( ArrayList<Float> notas ) {
            for (int i=0; i< notas.size(); i++){
              System.out.println(" Nota " + i + " : " + notas.get(i) ); 
            }
            System.out.println(" Fin Notas" ); 
		  // TODO - implement Alumuml.mostrar
	}

}