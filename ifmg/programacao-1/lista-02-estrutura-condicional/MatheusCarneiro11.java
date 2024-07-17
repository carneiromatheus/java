import java.util.Scanner;

public class MatheusCarneiro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data de votação (dd/mm/aaaa): ");
        String dateVoting = sc.nextLine();
        
        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dateBirth = sc.nextLine();

        sc.close();

        String[] splitDateVoting = dateVoting.split("/");
        String[] splitDateBirth = dateBirth.split("/");

        int votingDay = Integer.parseInt(splitDateVoting[0]);
        int votingMonth = Integer.parseInt(splitDateVoting[1]);
        int votingYear = Integer.parseInt(splitDateVoting[2]);

        int birthDay = Integer.parseInt(splitDateBirth[0]);
        int birthMonth = Integer.parseInt(splitDateBirth[1]);
        int birthYear = Integer.parseInt(splitDateBirth[2]);

        int age = votingYear - birthYear;
        if (votingMonth < birthMonth || (votingMonth == birthMonth && votingDay < birthDay)) {
            age--;
        }

        String situation;
        if (age < 16) {
            situation = "Não pode votar.";
        } else if (age >= 18 && age <= 70) {
            situation = "Voto obrigatório.";
        } else {
            situation = "Voto facultativo.";
        }

        System.out.println("Idade atual: " + age);
        System.out.println("Situação: " + situation);
    }
}