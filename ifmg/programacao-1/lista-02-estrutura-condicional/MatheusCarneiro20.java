import java.util.Scanner;

public class MatheusCarneiro20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o seu peso (ex: 1.75): ");
    double height = sc.nextDouble();

    System.out.print("Informe o seu sexo (M - F): ");
    String sex = sc.next();
    sc.nextLine();

    sc.close();

    double idealWeight;

    switch (sex) {
      case "M":
      case "m":
        idealWeight = (72.7 * height) - 58;
        break;

      case "F":
      case "f":
        idealWeight = (62.1 * height) - 44.7;
        break;

      default:
        System.out.println("Erro: Sexo (M - F)");
        return;
    }

    System.out.printf("Peso ideal: %.1f%n", idealWeight);
  }
}
