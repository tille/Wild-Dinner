package co.edu.eafit.dis.st0257.cenasalvajes;

public class Cocinero implements Runnable {
  private Olla olla;

  public Cocinero(Olla olla) {
    this.olla = olla;
  }

  public void run() {
    while (true) {
      olla.ponerPorciones();
    }
  }
}