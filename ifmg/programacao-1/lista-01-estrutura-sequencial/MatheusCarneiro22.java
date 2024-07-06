import java.util.Scanner;

public class MatheusCarneiro22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro valor (A): ");
    double valueA = scanner.nextDouble();

    System.out.print("Digite o segundo valor (B): ");
    double valueB = scanner.nextDouble();

    scanner.close();

    System.out.printf("Valores originais - A: %.2f, B: %.2f%n", valueA, valueB);

    double temp = valueA;
    valueA = valueB;
    valueB = temp;

    System.out.printf("Valores após troca - A: %.2f, B: %.2f%n", valueA, valueB);
  }
}
