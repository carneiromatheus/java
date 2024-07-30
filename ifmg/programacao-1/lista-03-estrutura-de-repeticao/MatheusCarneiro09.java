/* 
 * 9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário.
 * O valor de N deve ser fornecido pelo usuário.
 */

import java.util.Scanner;

public class MatheusCarneiro09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o número de elementos: ");
    int n = sc.nextInt();
    double sum = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Digite um número: ");
      double inputValue = sc.nextDouble();
      sum += inputValue;
    }

    double mean = sum / n;

    System.out.printf("Soma: %.3f%n", sum);
    System.out.printf("Média: %.3f%n", mean);

    sc.close();
  }
}
