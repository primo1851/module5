package java.exer2.kart;

public class Main {
  public static void main(String[] args) {
    Kart kart1 = new Kart("Kart A", "200", 150);

    Piloto piloto1 = new Piloto("João", false);

    piloto1.soltaSuperPoder();
    kart1.pular();
    kart1.mostraInfo();
  }
}
