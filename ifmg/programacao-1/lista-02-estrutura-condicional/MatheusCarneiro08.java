import java.util.Scanner;

public class MatheusCarneiro08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor de x: ");
    double number = sc.nextDouble();

    sc.close();

    double result;

    if (number <= 1) {
      result = 1;
    } else if (number <= 2) {
      result = 2;
    } else if (number <= 3) {
      result = Math.pow(number, 2);
    } else {
      result = Math.pow(number, 3);
    }

    System.out.printf("f(x) = %.2f%n", result);
  }
}
