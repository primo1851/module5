package java.exer2.kart;

public class Kart {
  private String name;
  private Motor motor;
  String cilindradas;
  float velocidadeMaxima;

  public Kart(String name, String cilindradas, float velocidadeMaxima) {
    this.name = name;
    this.motor = new Motor(cilindradas, velocidadeMaxima);
  }

  public void pular() {
    System.out.println("O kart pulou");
  }

  public void soltarTurbo() {
    System.out.println("O kart soltou o turbo");
  }

  public void fazerDrift() {
    System.out.println("O kart fez um drift");
  }

  public Motor mostraInfo() {
    System.out.println("O motor tem " + cilindradas + "cilindradas e a velocidade max e " + velocidadeMaxima + "Km/h.");
    return motor;
  }

}
