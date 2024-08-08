/* 
 * 10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores digitados,
 * seu programa deve encontrar o menor e o maior dos valores fornecidos.
 */

import java.util.Scanner;

public class MatheusCarneiro10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números irá comparar? ");
    int n = sc.nextInt();

    double smallest = Double.MAX_VALUE;
    double largest = -Double.MAX_VALUE;

    for (int i = 1; i <= n; i++) {
      System.out.printf("Digite o %dº valor: ", i);
      double temp = sc.nextDouble();

      if (temp < smallest) {
        smallest = temp;
      } else if (temp > largest) {
        largest = temp;
      }
    }

    sc.close();

    System.out.printf("""
        Maior: %.2f
        Menor: %.2f
        """, largest, smallest);
  }
}
