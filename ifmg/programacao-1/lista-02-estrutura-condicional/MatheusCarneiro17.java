import java.util.Scanner;

public class MatheusCarneiro17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = sc.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = sc.nextInt();

    System.out.print("Digite o terceiro número: ");
    int num3 = sc.nextInt();

    int largest, middle, smallest;
    if (num1 >= num2 && num1 >= num3) {
      largest = num1;
      if (num2 >= num3) {
        middle = num2;
        smallest = num3;
      } else {
        middle = num3;
        smallest = num2;
      }
    } else if (num2 >= num1 && num2 >= num3) {
      largest = num2;
      if (num1 >= num3) {
        middle = num1;
        smallest = num3;
      } else {
        middle = num3;
        smallest = num1;
      }
    } else {
      largest = num3;
      if (num1 >= num2) {
        middle = num1;
        smallest = num2;
      } else {
        middle = num2;
        smallest = num1;
      }
    }

    System.out.printf("""
        %nOrdem Crescente: %d, %d, %d
        Ordem Decrescente: %d, %d, %d
        """, smallest, middle, largest, largest, middle, smallest);

    sc.close();
  }
}
