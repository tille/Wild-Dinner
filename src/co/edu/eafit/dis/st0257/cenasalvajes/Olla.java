package co.edu.eafit.dis.st0257.cenasalvajes;

public class Olla {

    private int porciones = 0;

    public Olla(int porciones) {
		this.porciones = porciones;
    }

    public synchronized int obtenerPorcion() {
		if (porciones != 0){
			int ret = porciones--;
			return ret;
		}
		else
			Cocinero.run();
    }

    public synchronized void ponerPorciones() {
		porciones++;
    }
}
