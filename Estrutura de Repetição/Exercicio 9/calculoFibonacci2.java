import java.util.Scanner;

public class calculoFibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número máximo para a sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Por favor, informe um número inteiro não negativo.");
        } else {
            int a = 0, b = 1;
            int count = 0;

            System.out.print("Sequência de Fibonacci até " + num + ": ");
            while (a <= num) {
                System.out.print(a + " ");
                count++;
                int temp = a;
                a = b;
                b = temp + b;
            }

            System.out.println("\nTotal de números na sequência de Fibonacci até " + num + ": " + count);
        }

        scanner.close();
    }
}
