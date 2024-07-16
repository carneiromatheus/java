import java.util.Scanner;

public class MatheusCarneiro07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o preço do carro: ");
    double carPrice = sc.nextDouble();

    System.out.print("Digite o ano do carro: ");
    int yearManufactureCar = sc.nextInt();

    double tax = yearManufactureCar < 1900 ? carPrice * 1.01 : carPrice * 1.015;

    sc.close();

    System.out.printf("A taxa é: R$ %.2f%n", tax);
  }
}
