import java.util.Scanner;

public class MatheusCarneiro18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o valor atual do salário mínimo: ");
    double salary = sc.nextDouble();

    System.out.print("Informe o consumo de quilowatt: ");
    double kwConsumed= sc.nextDouble();

    sc.close();

    double kwPrice = salary * 0.20;
    double bill = kwConsumed * kwPrice;
    double discountBill = bill * (1 - 0.15);

    System.out.printf(
        "O valor pago por KW será: R$ %.2f%nO total da sua conta será: R$ %.2f%nO total da sua conta com desconto será: R$ %.2f",
        kwPrice, bill, discountBill);
  }
}
