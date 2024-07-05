import java.util.Scanner;

public class MatheusCarneiro16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de minutos: ");
    int minutes = scanner.nextInt();

    scanner.close();

    int hours = minutes / 60;
    int minutesLeft = minutes % 60;

    System.out.printf("%d minutos correspondem a %d hours e %d minutos.%n", minutes, hours, minutesLeft);
  }
}
