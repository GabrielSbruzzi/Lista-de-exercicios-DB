import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        System.out.print("Digite o número da sua escolha (1, 2 ou 3): ");
        int jogadorEscolha = scanner.nextInt();

        int computadorEscolha = random.nextInt(3) + 1;

        System.out.println("O computador escolheu: " + opcaoToString(computadorEscolha));

        switch (jogadorEscolha) {
            case 1:
                switch (computadorEscolha) {
                    case 1:
                        System.out.println("Empate! Ambos escolheram Pedra.");
                        break;
                    case 2:
                        System.out.println("Você perdeu! Papel cobre Pedra.");
                        break;
                    case 3:
                        System.out.println("Você ganhou! Pedra quebra Tesoura.");
                        break;
                }
                break;
            case 2:
                switch (computadorEscolha) {
                    case 1:
                        System.out.println("Você ganhou! Papel cobre Pedra.");
                        break;
                    case 2:
                        System.out.println("Empate! Ambos escolheram Papel.");
                        break;
                    case 3:
                        System.out.println("Você perdeu! Tesoura corta Papel.");
                        break;
                }
                break;
            case 3:
                switch (computadorEscolha) {
                    case 1:
                        System.out.println("Você perdeu! Pedra quebra Tesoura.");
                        break;
                    case 2:
                        System.out.println("Você ganhou! Tesoura corta Papel.");
                        break;
                    case 3:
                        System.out.println("Empate! Ambos escolheram Tesoura.");
                        break;
                }
                break;
            default:
                System.out.println("Escolha inválida! Por favor, escolha 1, 2 ou 3.");
                break;
        }

        scanner.close();
    }

    public static String opcaoToString(int opcao) {
        switch (opcao) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Opção inválida";
        }
    }
}
