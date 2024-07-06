import java.util.Scanner;

public class MatheusCarneiro24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: %.2f e %.2f%n", root1, root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.printf("A raiz da equação é: %.2f%n", root);

        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
