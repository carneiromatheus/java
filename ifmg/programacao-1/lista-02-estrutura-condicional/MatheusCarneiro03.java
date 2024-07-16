import java.util.Scanner;

public class MatheusCarneiro03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.err.print("Digite o valor do veículo: ");
    double costs = sc.nextDouble();

    sc.close();
    
    double distributor = 1;
    double taxes = 1 ;

    if (costs <= 28000) {
      distributor += 0.05;
    } else if (costs > 28000 && costs <= 45000) {
      distributor += 0.1;
      taxes += 0.15;
    } else if (costs > 45000) {
      distributor += 0.1;
      taxes += 0.2;
    }

    double valor = costs * (distributor + taxes);

    System.out.printf("O custo para o consumidor é: R$ %.2f%n", valor);
  }
}
