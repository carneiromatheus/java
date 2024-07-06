import java.util.Scanner;

public class MatheusCarneiro04 {
    // 4. Calcular média ponderada:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double firstGrade = sc.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        int firstGradeWeight = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        double secondGrade = sc.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        int secondGradeWeight = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        double thirdGrade = sc.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        int thirdGradeWeight = sc.nextInt();

        sc.close();

        double totalGrade = (firstGrade * firstGradeWeight) + (secondGrade * secondGradeWeight) + (thirdGrade * thirdGradeWeight);
        double weightSum = firstGradeWeight + secondGradeWeight + thirdGradeWeight;
        double average = totalGrade / weightSum;

        System.out.printf("A média é %.2f%n", average);
    }
}