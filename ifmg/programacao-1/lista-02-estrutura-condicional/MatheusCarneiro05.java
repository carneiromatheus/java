import java.util.Scanner;

public class MatheusCarneiro05 {
  public static void main(String[] args) {
    boolean vogal = false;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma letra: ");
    String letter = sc.nextLine();

    sc.close();

    switch (letter.toLowerCase()) {
      case "a":
        vogal = true;
        break;

      case "e":
        vogal = true;
        break;

      case "i":
        vogal = true;
        break;

      case "o":
        vogal = true;
        break;

      case "u":
        vogal = true;
        break;

      default:
        vogal = false;  
        break;
    }

    System.out.println(vogal ? "é vogal" : "não é vogal");
  }
}
