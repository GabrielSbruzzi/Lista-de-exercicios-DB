import java.util.Scanner;

public class lerNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        } while (numero != 10);

        System.out.println("Você digitou 10. Programa encerrado.");
        scanner.close();
    }
}
