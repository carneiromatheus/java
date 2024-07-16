import java.util.Scanner;

public class MatheusCarneiro09 {
  public static void main(String[] args) {
    String condition;

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o seu peso em kg (ex.: 74): ");
    double height = sc.nextDouble();

    System.out.print("Digite a sua altura em metros (ex.: 1.82): ");
    double weight = sc.nextDouble();

    sc.close();

    double imc = weight / Math.pow(height, 2);

    if (imc < 18.5) {
      condition = "abaixo do peso";
    } else if (imc <= 25) {
      condition = "peso normal";
    } else if (imc <= 30) {
      condition = "acima do peso";
    } else {
      condition = "obeso";
    }

    System.out.printf("IMC: %.1f%nCondição: %s%n", imc, condition);
  }
}