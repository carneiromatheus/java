public class MatheusCarneiro10 {
  // 10. Calcular de investimento:
  public static void main(String[] args) {
    double principal = 2000;
    double monthlyInterestRate = 0.5;
    int months = 2;
    int investmentTime = months * 12;

    // A = P * (1 + (r / 100))^n
    double amount = principal * Math.pow(1 + (monthlyInterestRate / 100), investmentTime);

    System.out.printf("O montante acumulado após 2 anos é: R$ %.2f", amount);
  }
}
