package co.edu.eafit.dis.st0257.cenasalvajes;

public class Cocinero
    implements Runnable {

    private Olla olla;

    public Cocinero(Olla olla) {

	this.olla = olla;
    }

    public void run() {

	while (true) {
	    System.out.println(this.toString() +
			       " a domir");
	    dormir();
	    System.out.println(this.toString() +
			       " a cocinar");
	    olla.ponerPorciones();
	}
    }

    public void dormir() {
	try {
	    Thread.sleep(10000);
	} catch (InterruptedException ie) {
	}
    }

    public String toString() {
	return "Cocinero ";
    }
}