package co.edu.eafit.dis.st0257.cenasalvajes;

import java.util.Random;

public class Salvaje implements Runnable {

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
      System.out.println(this.toString() + " solicita comida");
      int porcion = olla.obtenerPorcion();
      if( porcion <= 0 ) System.exit(-1);
      //assert porcion > 0;
      System.out.println(this.toString() + " toma 1 de los " + porcion + " que hay en olla. ");
      comer(porcion);
    }
  }

  public void comer(int porcion) {
    System.out.println(this.toString() + " comiendo ");
    try{
      Thread.sleep(rand.nextInt(porcion)*100);
    }catch(InterruptedException e){
    }
  }

  public String toString() {
    return "Salvaje: " + id;
  }
}