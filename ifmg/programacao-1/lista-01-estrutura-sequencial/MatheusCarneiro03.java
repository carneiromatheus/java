import java.util.Scanner;

public class MatheusCarneiro03 {
    // 3. Calcular (a * b) / c:
    // Ignorar erro divisão por 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o multiplicando: ");
        double multiplicand = sc.nextDouble();
        
        System.out.print("Digite o multiplicador: ");
        double multiplier = sc.nextDouble();
        
        System.out.print("Digite o divisor: ");
        double divisor = sc.nextDouble();

        sc.close();

        double product = multiplicand * multiplier;
        double quotient = product / divisor;

        System.out.printf("(%.2f x %.2f) / %.2f = %.2f", multiplicand, multiplier, divisor, quotient);
    }
}
