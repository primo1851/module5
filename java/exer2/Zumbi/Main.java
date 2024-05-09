package java.exer2.Zumbi;

public class Main {
  public static void main(String[] args) {
    Zumbi zumbi1 = new Zumbi("Zumberto", 5);

    System.out.println("Nome do Zumbi: " + zumbi1.getName());
    System.out.println("Tipo do Zumbi: " + zumbi1.getType());

    zumbi1.grunhir();
    zumbi1.mover();
  }

}
