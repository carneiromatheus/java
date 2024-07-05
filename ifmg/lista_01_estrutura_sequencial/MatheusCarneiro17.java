import java.util.Scanner;

public class MatheusCarneiro17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número real: ");
    double realNumber = sc.nextDouble();

    sc.close();

    int integerNumber = (int) realNumber;
    double fractionalNumber = (realNumber - integerNumber);

    System.out.printf("A parte inteira desse número é: %d%nA parte fracionária desse número é: %.3f",
        integerNumber, fractionalNumber);
  }
}
