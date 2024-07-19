import java.util.Scanner;

public class MatheusCarneiro16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o ano: ");
    int year = sc.nextInt();

    sc.close();

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.printf("O ano de %d é bissexto.%n", year);
    } else {
      System.out.printf("O ano de %d não é bissexto.%n", year);
    }
  }
}
