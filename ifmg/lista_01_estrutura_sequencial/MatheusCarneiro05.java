import java.util.Scanner;

public class MatheusCarneiro05 {
    // 5. Calcular salário a receber:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário base: ");
        double salary = sc.nextDouble();

        sc.close();

        double bonus = 0.1;
        double tax = 0.05;
        double grossSalary = salary * (1 + bonus);
        double netSalary = grossSalary * (1 - tax);

        System.out.printf("Seu salário a receber é R$ %.2f", netSalary);
    }
}
