import java.util.Scanner;

public class MatheusCarneiro09 {
    // 9. Calcular o número de diagonais de um polígono convexo regular:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono convexo regular: ");
        int sides = scanner.nextInt();

        double diagonals = sides * (sides - 3) / 2.0;

        scanner.close();

        System.out.println("O número de diagonais do polígono é: " + diagonals);
    }
}
