import java.util.Scanner;

public class MatheusCarneiro14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do cômodo (em metros): ");
        double length = scanner.nextDouble();
        
        System.out.print("Digite a largura do cômodo (em metros): ");
        double width = scanner.nextDouble();
        
        scanner.close();
        
        double area = length * width;
        double requiredPower = area * 18;
        
        System.out.printf("A área do cômodo é: %.2f m²%n", area);
        System.out.printf("A potência de iluminação necessária é: %.2f W", requiredPower);
    }
}
