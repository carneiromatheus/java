import java.util.Scanner;

public class MatheusCarneiro12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite os três lados do triângulo (utilizar espaços ou entre para separar os valores): ");
    double side1 = sc.nextDouble();
    double side2 = sc.nextDouble();
    double side3 = sc.nextDouble();
    sc.close();

    String triangleType;
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
      if (side1 == side2 && side2 == side3) {
        triangleType = "equilátero";
      } else if (side1 == side2 || side1 == side3 || side2 == side3) {
        triangleType = "isósceles";
      } else {
        triangleType = "escaleno";
      }
      System.out.println("Os valores formam um triângulo " + triangleType + ".");
    } else {
      System.out.println("Os valores não formam um triângulo.");
    }
  }
}
