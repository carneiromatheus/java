import java.util.Scanner;

public class MatheusCarneiro04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    while (true) {
      System.out.print("Digite um número inteiro ou \"-999\" para sair: ");
      num = sc.nextInt();

      if (num == -999) {
        break;
      } else {
        System.out.printf("O triplo de %d é %d.%n", num, num * 3);
      }
    }

    sc.close();
  }
}
