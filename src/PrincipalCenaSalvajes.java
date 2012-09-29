import co.edu.eafit.dis.st0257.cenasalvajes.Olla;
import co.edu.eafit.dis.st0257.cenasalvajes.Salvaje;
import co.edu.eafit.dis.st0257.cenasalvajes.Cocinero;

public class PrincipalCenaSalvajes {

  public static void usage() {
    System.err.println("Usage: java MainCenaSalvaje " + " <nSalvajes> <nPorcioens>");
    System.exit(1);
  }

  public static void main(String args[]) {
    if (args.length != 2) usage();

    int nSalvajes = Integer.parseInt(args[0]);
    int nPorciones = Integer.parseInt(args[1]);
    if (nSalvajes <= 0 || nPorciones <= 0) usage();

    Olla olla = new Olla(nPorciones);
  
    new Thread(new Cocinero(olla)).start();
    for (int i = 0; i < nSalvajes; ++i) {
      new Thread(new Salvaje(i, olla)).start();
    }
  }
}
