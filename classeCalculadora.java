import java.util.Scanner;

public class classeCalculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void exibirMenu() {
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potenciação");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirMenu();

        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = somar(num1, num2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            case 5:
                resultado = potencia(num1, num2);
                System.out.println("Resultado da potenciação: " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}
