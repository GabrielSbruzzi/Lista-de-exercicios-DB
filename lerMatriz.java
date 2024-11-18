import java.util.Scanner;

public class lerMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz quadrada (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonal += matriz[i][i]; 
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        scanner.close();
    }
}
