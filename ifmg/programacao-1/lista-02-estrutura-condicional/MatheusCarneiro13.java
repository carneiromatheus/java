import java.util.Scanner;

public class MatheusCarneiro13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro de 3 dígitos: ");
    int number = scanner.nextInt();

    scanner.close();

    if (number > 999) {
      System.out.printf("O número %d possui mais de 3 dígitos.%n", number);
    } else {
      int hundred = number / 100;
      int unit = number % 10;

      if (hundred == unit) {
        System.out.printf("O número %d é um palíndromo.%n", number);
      } else {
        System.out.printf("O número %d não é um palíndromo.%n", number);
      }
    }
  }
}
