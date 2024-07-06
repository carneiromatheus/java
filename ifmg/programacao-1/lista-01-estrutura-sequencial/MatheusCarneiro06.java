import java.util.Scanner;

public class MatheusCarneiro06 {
    // 6. Calcular salário mais comissão:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salary = sc.nextDouble();

        System.out.print("Digite o valor das vendas realizadas: ");
        double sales = sc.nextDouble();

        sc.close();

        double commission = sales * 0.04;
        double grossSalary = salary + commission;

        System.out.printf("Seu salário + comissão será R$ %.2f", grossSalary);
    }
}
