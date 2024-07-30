/* 
 * 6. Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos.
 * Soma = 1 + 2 + 3 + ... + N
 */

import java.util.Scanner;

public class MatheusCarneiro06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    double mean = 0;

    System.out.print("Digite até qual número quer somar: ");
    int limit = sc.nextInt();

    for (int i = 1; i <= limit; i++) {
      sum += i;
    }

    mean = (double) sum / limit;
    System.out.printf("""
        A soma dos %d primeiros números positivos:  %d
        A média dos %d primeiros números positivos: %.1f
        """, limit, sum, limit, mean);

    sc.close();
  }
}
