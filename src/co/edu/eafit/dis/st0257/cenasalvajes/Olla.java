package co.edu.eafit.dis.st0257.cenasalvajes;

public class Olla {

  private int porciones = 0, tamanio = 0;

  public Olla(int porciones) {
    this.porciones = this.tamanio = porciones;
  }

  public synchronized int obtenerPorcion() {
    if(porciones == 0){ 
      notify();
      desactivar();
    }
    int ret = porciones--;
    return ret;
  }

  public synchronized void ponerPorciones() {
    if(porciones == tamanio){ 
      System.out.println("Cocinero a dormir");
      desactivar();
    }
    System.out.println("Cocinero a cocinar");
    porciones = tamanio;
    notify();
  }

  public void desactivar(){
    try{
      wait();
    } catch(InterruptedException ie) {
    }
  }
}