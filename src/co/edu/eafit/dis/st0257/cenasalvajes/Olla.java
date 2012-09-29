package co.edu.eafit.dis.st0257.cenasalvajes;

public class Olla {

    private int porciones = 0;

    public Olla(int porciones) {
	this.porciones = porciones;
    }

    public int obtenerPorcion() {

	int ret = porciones--;
	return ret;
    }

    public void ponerPorciones() {
    }
}
