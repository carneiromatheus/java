import java.util.Scanner;

public class MatheusCarneiro19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o código (1 - 40): ");
    int codeInput = sc.nextInt();

    if (codeInput <= 0 || codeInput > 40) {
      System.out.println("Erro: Código inválido (1 -40).");
      sc.close();
      return;
    }

    double unitValue;

    int codeGroup = (codeInput - 1) / 10;
    switch (codeGroup) {
      case 0:
        unitValue = 10;
        break;

      case 1:
        unitValue = 20;
        break;

      case 2:
        unitValue = 30;
        break;

      case 3:
        unitValue = 40;
        break;

      default:
        unitValue = 0;
        break;
    }

    System.out.print("Digite a quantidade: ");
    int quantity = sc.nextInt();

    double totalPurchase = unitValue * quantity;
    double discount;

    if (totalPurchase <= 250) {
      discount = totalPurchase * 0.05;
    } else if (totalPurchase <= 500) {
      discount = totalPurchase * 0.1;
    } else {
      discount = totalPurchase * 0.15;
    }

    double valuePay = totalPurchase - discount;

    System.out.printf("""
        %nValor unitário........R$ %.2f
        Total da compra.......R$ %.2f
        Valor do desconto.....R$ %.2f
        Valor a pagar.........R$ %.2f
        """, unitValue, totalPurchase, discount, valuePay);

    sc.close();
  }
}
