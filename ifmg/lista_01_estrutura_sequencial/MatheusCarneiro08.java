import java.util.Scanner;

public class MatheusCarneiro08 {
    // 8. Calcular área do trapézio e valor do metro quadrado:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor (m²) do comprimento maior: ");
        double largerBase = sc.nextDouble();

        System.out.print("Informe o valor (m²) do comprimento menor: ");
        double smallerBase = sc.nextDouble();

        System.out.print("Informe o valor (m²) da largura: ");
        double height = sc.nextDouble();

        System.out.print("Informe o preço (R$) do metro quadrado: ");
        double metreValue = sc.nextDouble();

        sc.close();

        double area = ((largerBase + smallerBase) * height) / 2;
        double averageValue = area * metreValue;

        System.out.printf("Área total: %.2f m²%nValor médio: R$ %.2f%n", area, averageValue);
    }
}
