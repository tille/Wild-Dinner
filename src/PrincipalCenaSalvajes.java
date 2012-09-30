import co.edu.eafit.dis.st0257.cenasalvajes.Olla;
import co.edu.eafit.dis.st0257.cenasalvajes.Salvaje;
import co.edu.eafit.dis.st0257.cenasalvajes.Cocinero;

public class PrincipalCenaSalvajes {

  private int nSalvajes, nPorciones;

  public static void usage() {
    System.err.println("Usage: java MainCenaSalvaje " + " <nSalvajes> <nPorcioens>");
    System.exit(1);
  }

  public static void main(String args[]) {
    int nSalvajes = 2, nPorciones = 4;

    if (args.length == 2){
      nSalvajes = Integer.parseInt(args[0]);
      nPorciones = Integer.parseInt(args[1]);
    }
    if (nSalvajes <= 0 || nPorciones <= 0) usage();

    Olla olla = new Olla(nPorciones);
    new Thread(new Cocinero(olla)).start();
    for (int i = 0; i < nSalvajes; ++i) {
      new Thread(new Salvaje(i, olla)).start();
    }
  }
}
