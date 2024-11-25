import java.util.Random;

public class ordenarVetor {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }

        System.out.println("Vetor antes da ordenação:");
        exibirVetor(vetor);

        bubbleSort(vetor);

        System.out.println("\nVetor após a ordenação:");
        exibirVetor(vetor);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
