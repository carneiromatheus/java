import java.util.Scanner;

public class MatheusCarneiro06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o seu salário: ");
    double salary = sc.nextDouble();

    sc.close();

    double newSalary = salary < 700.00 ? salary * 1.3 : salary * 1.1;

    System.out.printf("O novo salário é de R$ %.2f%n", newSalary);
  }
}
