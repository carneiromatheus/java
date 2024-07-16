import java.util.Scanner;

public class MatheusCarneiro10 {
  public static void main(String[] args) {
    int constN;

    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o diâmetro: ");
    double diameter = sc.nextDouble();

    System.out.print("Informe a carga: ");
    double load = sc.nextDouble();

    sc.close();

    if (diameter < 50) {
      constN = 6;
    } else if (diameter > 100) {
      constN = 2;
    } else {
      constN = 4;
    }

    double strain = ((4 * load) / (Math.PI * Math.pow(diameter, 2))) * constN;

    System.out.printf("S = %.3f%n", strain);
  }
}