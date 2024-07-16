import java.util.Scanner;

public class MatheusCarneiro02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = sc.nextInt();

    sc.close();

    int remainder = number % 2;
    String typeNumber = remainder == 0? "par" : "impar";

    System.out.printf("O número é %s%n", typeNumber);
  }
}
