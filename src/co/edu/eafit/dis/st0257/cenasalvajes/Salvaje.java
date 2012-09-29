package co.edu.eafit.dis.st0257.cenasalvajes;

import java.util.Random;

public class Salvaje
    implements Runnable {

    private int id;
    private Olla olla;
    private Random rand;

    public Salvaje(int id, Olla olla) {
	this.id = id;
	this.olla = olla;
	rand = new Random();
    }

    public void run() {

	while (true) {
	    System.out.println(this.toString() +
			       " solicita comida");
	    int porción = olla.obtenerPorcion();
	    assert porción > 0;
	    System.out.println(this.toString() +
			       " come: " +
			       porción);
	    comer(porción);
	}
    }

    public void comer(int porción) {

	try {
	    System.out.println(this.toString() +
			       " comiendo ");
	    Thread.sleep(rand.nextInt(porción)*100);
	}
	catch (InterruptedException ie) {
	}
    }

    public String toString() {
	return "Salvaje: " + id;
    }
}