import java.util.Scanner;

public class MatheusCarneiro02 {
    // 2. Encontrar antecessor e sucessor de um número:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        sc.close();

        int predecessor = number - 1;
        int successor = number + 1;

        System.out.printf("Seu antecessor é %d%n", predecessor);
        System.out.printf("Seu sucessor é %d%n", successor);
    }
}
