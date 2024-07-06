import java.util.Scanner;

public class MatheusCarneiro12 {
  // 12. Calcular voltas da Dona Maria
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a medida da rua A (em metros): ");
    double streetA = scanner.nextDouble();

    System.out.print("Digite a medida da rua B (em metros): ");
    double streetB = scanner.nextDouble();

    System.out.print("Digite a meta diária de caminhada (em km): ");
    double dailyGoalKm = scanner.nextDouble();

    scanner.close();

    double hypotenuse = Math.sqrt(Math.pow(streetA, 2) + Math.pow(streetB, 2));
    double perimeter = streetA + streetB + hypotenuse;
    double dailyGoalMeters = dailyGoalKm * 1000;

    double laps = Math.ceil(dailyGoalMeters / perimeter);

    System.out.printf("Dona Maria precisa fazer %.2f voltas no quarteirão para atingir sua meta diária de caminhada.",
        laps);

  }
}
