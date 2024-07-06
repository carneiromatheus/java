import java.util.Scanner;

public class MatheusCarneiro19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.err.print("Digite um número: ");
    double number = sc.nextInt();

    sc.close();

    double powerTwo = Math.pow(number, 2);
    double powerThree = Math.pow(number, 3);
    double sqrt = Math.sqrt(number);
    double cbrt = Math.cbrt(number);

    System.out.printf("%.3f ao quadrado é igual a %.3f%n", number, powerTwo);
    System.out.printf("%.3f ao cubo é igual a %.3f%n", number, powerThree);
    System.out.printf("A raiz quadrada de %.3f é igual a %.3f%n", number, sqrt);
    System.out.printf("A raiz cubica de %.3f é igual a %.3f%n", number, cbrt);
  }
}
