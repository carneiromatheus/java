import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String titutloReceita = "Bolo de Cenoura";
        final String titutloReceita2 = "Bolo de chocolate";
        // titutloReceita2 = "Bolo de fubá";
        int quantidadeIngredientes = 3;
        double procoVenda = 5.5;
        boolean vegetariana = true;

        String nome = "Mara";
        String sobrenome = "Maravilha";
        String nomeAutora = nome + " " + sobrenome;
        System.out.println(nomeAutora);

        int numero = 10;
        System.out.println(numero % 2 == 0);

        if (quantidadeIngredientes != 2) {
        System.out.println("Receita é fácil");
        } else {
        System.out.println("Receita difícil");
        }

        int quantidadeReceitas = 4;
        while (quantidadeReceitas != 0) {
        System.out.println("Está é a receita " + quantidadeReceitas);
        quantidadeReceitas -= 1;
        }

        for (int qtde = 4; qtde != 0; qtde--) {
        System.out.println("Essa é a receite número " + qtde);
        }

        String[] receitas = {"Stroganoff", "Feijoada", "Rocambole"};
        for(int i = 0; i < receitas.length; i++) {
        System.out.println(receitas[i]);
        }

        System.out.println(receitas);

        // String[] autores = {};
        String[] autores = new String[3];
        autores[0] = "Let";
        autores[1] = "André";
        autores[2] = "Claudia";
        for (int i = 0; i < autores.length; i++) {
            System.out.println(autores[i]);
        }
        
        List<String> autores2 = new ArrayList<>();
        autores2.add("Letícia");
        autores2.add("Bianca");
        for (int i = 0; i < autores2.size(); i++) {
            System.out.println(autores2.get(i));
        }
        System.out.println(autores2);
    }
}
