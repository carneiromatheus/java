import java.util.Scanner;

public class MatheusCarneiro04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double firstNumber = getNumber(sc, "Digite o primeiro número: ");
    String operator = getOperator(sc, "Digite o operador matemático (+, -, *, /): ");
    double secondNumber = getNumber(sc, "Digite o segundo número: ");

    sc.close();

    try {
      double result = calculate(firstNumber, operator, secondNumber);
      System.out.printf("Resultado: %.3f%n", result);
    } catch (IllegalArgumentException error) {
      System.out.println("Erro: " + error.getMessage());
    }
  }

  private static double getNumber(Scanner sc, String prompt) {
    System.out.print(prompt);
    while (!sc.hasNextDouble()) {
      System.out.printf("Atenção: Entrada inválida.%n%s", prompt);
      sc.next();
    }
    return sc.nextDouble();
  }

  private static String getOperator(Scanner sc, String prompt) {
    System.out.print(prompt);
    String operator = sc.next();
    while (!operator.matches("[+\\-*/]")) {
      System.out.printf("Atenção: Operador inválido.%n%s", prompt);
      operator = sc.next();
    }
    return operator;
  }

  private static double calculate(double firstNumber, String operator, double secondNumber) {
    switch (operator) {
      case "+":
        return firstNumber + secondNumber;
      case "-":
        return firstNumber - secondNumber;
      case "*":
        return firstNumber * secondNumber;
      case "/":
        if (secondNumber == 0) {
          throw new IllegalArgumentException("Divisão por zero.");
        }
        return firstNumber / secondNumber;
      default:
        throw new IllegalArgumentException("Operador inválido.");
    }
  }
}
