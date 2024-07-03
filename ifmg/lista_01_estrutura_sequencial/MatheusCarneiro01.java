import java.util.Scanner;

public class MatheusCarneiro01 {
    // 1. Calcular a soma e média de 3 números:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double firstGrade = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double secondGrade = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double thirdGrade = sc.nextDouble();

        sc.close();

        double sum = firstGrade + secondGrade + thirdGrade;
        double average = sum / 3;

        System.out.printf("A soma é %.2f%nA média é %.2f%n", sum, average);
    }
}
