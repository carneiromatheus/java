import java.util.Scanner;

public class MatheusCarneiro13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano atual: ");
        int currentYear = scanner.nextInt();
        
        scanner.close();

        int firstWorldCupYear = 1930;
        int cupsCancelled = 2;
        
        int yearsSinceFirstCup = currentYear - firstWorldCupYear;
        int numberOfCups = (yearsSinceFirstCup / 4) + 1 - cupsCancelled;
        
        System.out.println("O número de Copas do Mundo já realizadas é: " + numberOfCups);
    }
}
