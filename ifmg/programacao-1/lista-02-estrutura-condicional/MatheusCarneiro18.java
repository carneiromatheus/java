import java.util.Scanner;

public class MatheusCarneiro18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o seu CPF: ");
    String cpfInput = sc.next();

    sc.nextLine();

    String cpfClean = cpfInput.replaceAll("[^\\d]", "");

    if (cpfClean.length() != 11) {
      System.out.println("CPF inválido. Certifique-se de que o CPF contém 11 dígitos.");
    } else {
      int firstDigit = Integer.parseInt(cpfClean.substring(9, 10));
      int secondDigit = Integer.parseInt(cpfClean.substring(10, 11));
      int first9Numbers = Integer.parseInt(cpfClean.substring(0, 9));
      long first10Numbers = Long.parseLong(cpfClean.substring(0, 10));
      int sum = 0;

      for (int i = 2; i <= 10; i++) {
        sum += (first9Numbers % 10) * i;
        first9Numbers /= 10;
      }

      int firstDigitTest = (sum % 11) < 2 ? 0 : 11 - (sum % 11);

      sum = 0;

      for (int i = 2; i <= 11; i++) {
        sum += (first10Numbers % 10) * i;
        first10Numbers /= 10;
      }

      int secondDigitTest = (sum % 11) < 2 ? 0 : 11 - (sum % 11);

      if (firstDigitTest != firstDigit || secondDigitTest != secondDigit) {
        System.out.println("CPF Inválido.");
      } else {
        System.out.println("CPF Válido.");
      }
    }

    sc.close();
  }
}
