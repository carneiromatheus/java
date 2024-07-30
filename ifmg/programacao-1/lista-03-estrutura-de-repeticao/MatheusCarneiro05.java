/* 
 * 5. Faça um programa que calcule e imprima a soma e a média dos 10 primeiros
 * números positivos.Soma = 1 + 2 + 3 + ... + 10
 */

public class MatheusCarneiro05 {
  public static void main(String[] args) {
    int sum = 0;
    double mean = 0;

    for (int i = 1; i <= 10; i++) {
      sum += i;
    }

    mean = (double) sum / 10;

    System.out.printf("""
        A soma dos 10 primeiros números positivos:  %d
        A média dos 10 primeiros números positivos: %.1f
        """, sum, mean);
  }
}
