import java.util.Scanner;

public class MatheusCarneiro15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número de 4 dígitos: ");
    int numberInput = sc.nextInt();

    sc.close();

    int number = numberInput;
    boolean isBinary = true;
    boolean hasError = false;

    if (number > 999 && number <= 9999) {
      for (int i = 1; i <= 4; i++) {
        int type = number % 10;

        if (type != 0 && type != 1) {
          isBinary = false;
          break;
        }

        number /= 10;
      }

    } else {
      hasError = true;
      System.out.println("Erro: número não tem 4 dígitos.");
    }

    if (isBinary && !hasError) {
      System.out.printf("O número %d pode ser binário.%n", numberInput);
    } else if (!hasError) {
      System.out.printf("O número %d não pode ser binário.%n", numberInput);
    }
  }
}
