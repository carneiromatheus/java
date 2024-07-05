import java.util.Scanner;

public class MatheusCarneiro11 {
  // 11. Calcular multa das contas e salário restante:
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário de João: R$ ");
    double salary = scanner.nextDouble();

    System.out.print("Digite o valor da primeira conta: R$ ");
    double bill1 = scanner.nextDouble();

    System.out.print("Digite o valor da segunda conta: R$ ");
    double bill2 = scanner.nextDouble();

    scanner.close();

    double penalty1 = bill1 * 0.02;
    double penalty2 = bill2 * 0.02;
    double totalToPay = bill1 + penalty1 + bill2 + penalty2;
    double remainingSalary = salary - totalToPay;

    System.out.printf("Após o pagamento das contas, o salário restante de João será de R$ %.2f", remainingSalary);
  }
}
