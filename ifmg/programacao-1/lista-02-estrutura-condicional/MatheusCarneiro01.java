import java.util.Scanner;

public class MatheusCarneiro01 {
  public static void main(String[] args) {
    String category = "";

    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a idade do nadador: ");
    int age = sc.nextInt();

    sc.close();

    if (age >= 5 && age <= 7) {
      category = "infantil";
    } else if (age >= 8 && age <= 10) {
      category = "juvenil";
    } else if (age >= 11 && age <= 15) {
      category = "adolescente";
    } else if (age >= 16 && age <= 40) {
      category = "adulto";
    } else if (age > 40) {
      category = "sênior";
    } else {
      category = "inválido";
    }

    System.out.printf("Atleta %s%n", category);
  }
}
