import java.util.Scanner;

public class MatheusCarneiro15 {
    public static void main(String[] args) {
        final double PI = 3.1416;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio da circunferência: ");
        double radius = scanner.nextDouble();
        
        scanner.close();
        
        double area = PI * Math.pow(radius, 2);
        
        System.out.printf("A área da circunferência é: %.4f m²", area);
    }
}
