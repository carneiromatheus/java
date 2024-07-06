import java.util.Scanner;

public class MatheusCarneiro21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a medida do ângulo em graus: ");
    double angleDegrees = scanner.nextDouble();

    System.out.print("Digite a altura da parede: ");
    double wallHeight = scanner.nextDouble();

    scanner.close();

    double angleRadians = Math.toRadians(angleDegrees);
    double ladderLength = wallHeight / Math.sin(angleRadians);

    System.out.printf("A medida da escada necessária é: %.2f metros", ladderLength);
  }
}
