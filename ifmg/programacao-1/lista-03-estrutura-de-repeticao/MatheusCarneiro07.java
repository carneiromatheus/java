/* 7. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N.
 * O valor de N deve ser positivo e fornecido pelo usuário.
 */

import java.util.Scanner;

public class MatheusCarneiro07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sum = 0;

    System.out.print("Digite o valor de N (positivo): ");
    int limit = sc.nextInt();

    if (limit < 1) {
      System.out.println("Erro: \"N\" não positivo.");
    } else {
      for (int i = 1; i <= limit; i++) {
        sum += (double) 1 / i;
      }

      System.out.printf("A soma do inverso dos %d primeiros números:  %.1f%n", limit, sum);
    }

    sc.close();
  }
}
