import java.util.Scanner;

public class MatheusCarneiro07 {
    // 7. Calcular a área e o perímetro de um retângulo: 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double height = sc.nextDouble();

        sc.close();

        double area = base * height;
        double perimeter = 2 * (base + height);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);
    }
}
