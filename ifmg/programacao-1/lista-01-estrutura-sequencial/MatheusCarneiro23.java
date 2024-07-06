public class MatheusCarneiro23 {
  public static void main(String[] args) {
    int totalViewers = 3000;
    int viewersA = 1450;
    int viewersB = 1150;
    int viewersC = 900;
    int viewersAB = 350;
    int viewersAC = 400;
    int viewersBC = 300;
    int viewersABC = 100;
    int unionABC = viewersA + viewersB + viewersC - viewersAB - viewersAC - viewersBC + viewersABC;
    int noViewers = totalViewers - unionABC;

    System.out.printf("O número de telespectadores que não gostam de nenhuma novela é: %d%n", noViewers);
  }
}
