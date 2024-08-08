import java.util.Scanner;

/**
 * 11. Faça um programa que leia a nota e o nome de N alunos na prova de
 * algoritmos
 * e imprima a maior e a menor nota computada e qual aluno tirou tais notas.
 * Além disso, calcule e imprima também a soma e a média de todas as notas.
 */

public class MatheusCarneiro11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String studentHigher = "";
    String studentLower = "";
    double higherGrade = 0;
    double lowerGrade = 100;
    double sumGrade = 0;
    double average = 0;
    int numberStudents = 0;

    while (true) {
      System.out.print("Digite a quantidade de alunos: ");
      try {
        numberStudents = sc.nextInt();
        if (numberStudents > 0)
          break;
        else
          System.out.println("Entrada inválida: o número deve ser positivo.");
      } catch (Exception e) {
        System.out.println("Entrada inválida: Por favor digite, um número inteiro.");
        sc.next();
      }
    }

    sc.nextLine();

    for (int i = 1; i <= numberStudents; i++) {
      System.out.printf("Informe o nome do %dº aluno: ", i);
      String nameTemp = sc.nextLine();
      double gradeTemp = 0;

      while (true) {
        System.out.printf("Informe a nota do %dº aluno: ", i);

        try {
          gradeTemp = sc.nextDouble();
          if (gradeTemp >= 0 && gradeTemp <= 100)
            break;
          else
            System.out.println("Entrada inválida: A nota deve estar entre 0 e 100.");
        } catch (Exception e) {
          System.out.println("Entrada inválida: Por favor, insira um número real.");
          sc.next();
        }
      }

      sc.nextLine();

      sumGrade += gradeTemp;
      average = sumGrade / numberStudents;

      if (gradeTemp < lowerGrade) {
        lowerGrade = gradeTemp;
        studentLower = nameTemp;
      }

      if (gradeTemp > higherGrade) {
        higherGrade = gradeTemp;
        studentHigher = nameTemp;
      }
    }

    System.out.printf("""
        %s teve a maior nota: %.2f
        %s teve a menor nota: %.2f
        Soma das notas: %.2f
        Média das notas: %.2f
        """, studentHigher, higherGrade, studentLower, lowerGrade, sumGrade, average);

    sc.close();
  }
}