import java.util.Scanner;

public class MatheusCarneiro21 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o salário base: ");
    double baseSalary = sc.nextDouble();
    System.out.print("Digite o tempo: ");
    int yearsOfService = sc.nextInt();

    double tax;
    if (baseSalary >= 700) {
      tax = baseSalary * 0.12;
    } else if (baseSalary > 450) {
      tax = baseSalary * 0.08;
    } else if (baseSalary >= 200) {
      tax = baseSalary * 0.03;
    } else {
      tax = 0;
    }

    int bonus;
    if (baseSalary > 500) {
      bonus = (yearsOfService > 3) ? 30 : 20;
    } else {
      if (yearsOfService >= 6) {
        bonus = 33;
      } else if (yearsOfService >= 3) {
        bonus = 35;
      } else {
        bonus = 23;
      }
    }
    
    double netSalary = baseSalary - tax + bonus;

    char category;
    if (netSalary >= 600) {
      category = 'C';
    } else if (netSalary >= 350) {
      category = 'B';
    } else {
      category = 'A';
    }

    System.out.printf("""
        %nImposto: R$ %.2f
        Gratificação: R$ %d.00
        Salario liquido: R$ %.2f
        Categoria: %c
        """, tax, bonus, netSalary, category);

    sc.close();
  }
}
