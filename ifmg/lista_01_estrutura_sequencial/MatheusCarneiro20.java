import java.util.Scanner;

public class MatheusCarneiro20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do salário mínimo: ");
    double minimumWage = scanner.nextDouble();
    
    System.out.print("Digite o número de horas trabalhadas: ");
    int workedHours = scanner.nextInt();

    System.out.print("Digite o número de horas extras trabalhadas: ");
    int extraHours = scanner.nextInt();

    scanner.close();

    double hourlyWage = 0.125 * minimumWage;
    double extraHourlyWage = 0.25 * minimumWage;
    double grossSalary = workedHours * hourlyWage;
    double extraAmount = extraHours * extraHourlyWage;
    double totalSalary = grossSalary + extraAmount;

    System.out.printf("O salário a receber é: R$ %.2f", totalSalary);
  }
}
