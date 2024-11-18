import java.util.Scanner;

public class calculoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro não pode ser negativo: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Por favor, informe um número inteiro não pode ser negativo");
        } else {
            int a = 0, b = 1;

            System.out.print("Sequência de Fibonacci até " + num + ": ");
            while (a <= num) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
        }

        scanner.close();
    }
}
