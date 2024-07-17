import java.util.Scanner;

public class MatheusCarneiro14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o DDD: ");
        int ddd = scanner.nextInt();
        scanner.close();

        String estado;

        switch (ddd) {
            case 68:
                estado = "Acre";
                break;
            case 82:
                estado = "Alagoas";
                break;
            case 96:
                estado = "Amapá";
                break;
            case 92:
            case 97:
                estado = "Amazonas";
                break;
            case 71:
            case 73:
            case 74:
            case 75:
            case 77:
                estado = "Bahia";
                break;
            case 85:
            case 88:
                estado = "Ceará";
                break;
            case 61:
                estado = "Distrito Federal";
                break;
            case 27:
            case 28:
                estado = "Espírito Santo";
                break;
            case 62:
            case 64:
                estado = "Goiás";
                break;
            case 98:
            case 99:
                estado = "Maranhão";
                break;
            case 65:
            case 66:
                estado = "Mato Grosso";
                break;
            case 67:
                estado = "Mato Grosso do Sul";
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                estado = "Minas Gerais";
                break;
            case 91:
                estado = "Pará";
                break;
            case 83:
                estado = "Paraíba";
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                estado = "Paraná";
                break;
            case 81:
            case 87:
                estado = "Pernambuco";
                break;
            case 86:
            case 89:
                estado = "Piauí";
                break;
            case 21:
            case 22:
            case 24:
                estado = "Rio de Janeiro";
                break;
            case 84:
                estado = "Rio Grande do Norte";
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                estado = "Rio Grande do Sul";
                break;
            case 69:
                estado = "Rondônia";
                break;
            case 95:
                estado = "Roraima";
                break;
            case 47:
            case 48:
            case 49:
                estado = "Santa Catarina";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                estado = "São Paulo";
                break;
            case 79:
                estado = "Sergipe";
                break;
            case 63:
                estado = "Tocantins";
                break;
            default:
                estado = "DDD não encontrado";
                break;
        }

        System.out.println("O DDD " + ddd + " pertence ao estado: " + estado);
    }
}
