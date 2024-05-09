package java.exer1;

import java.util.Scanner;

public class SomaIdades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    int somaIdades = 0;

    do {
      System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
      int idade = scanner.nextInt();

      if (idade >= 0) {
        somaIdades += idade;
        contador++;
      } else {
        System.out.println("Idade inválida. Por favor, digite novamente.");
      }
    } while (contador < 5);

    System.out.println("A soma das idades é: " + somaIdades);

    scanner.close();
  }
}
