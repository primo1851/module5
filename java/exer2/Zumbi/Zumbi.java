package java.exer2.Zumbi;

public class Zumbi {
  private String name;
  private int type;

  public Zumbi(String name, int type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public int getType() {
    return type;
  }

  public void grunhir() {
    System.out.println("Grrrrr...");
  }

  public void mover() {
    System.out.println("O zumbi " + name + " está se movendo.");
  }
}
