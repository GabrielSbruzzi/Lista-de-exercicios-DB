import java.util.Scanner;

public class mediaAlunos {
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double somaNotas = nota1 + nota2 + nota3 + nota4;
        return somaNotas / 4;
    }

    public static String determinarStatus(double media) {
        if (media > 6) {
            return "Aprovado";
        } else if (media >= 4 && media <= 6) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.println("Média do aluno: " + media);

        String status = determinarStatus(media);
        System.out.println("Status do aluno: " + status);

        scanner.close();
    }
}
