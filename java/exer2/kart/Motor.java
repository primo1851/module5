package java.exer2.kart;

public class Motor {
  private String cilindradas;
  private float velocidadeMaxima;

  public Motor(String cilindradas, float velocidadeMaxima) {
    this.cilindradas = cilindradas;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void mostraInfo() {
    System.out.println("O motor tem " + cilindradas + "cilindradas e a velocidade max e " + velocidadeMaxima + "Km/h.");
  }

}
