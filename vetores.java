import java.util.Random;
import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        
        Random random = new Random();
        
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = random.nextInt(1000);
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = random.nextInt(1000); 
        }

        System.out.println("Vetor 1 antes da ordenação:");
        exibirVetor(vetor1);

        System.out.println("Vetor 2 antes da ordenação:");
        exibirVetor(vetor2);

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        System.out.println("\nVetor 1 após a ordenação:");
        exibirVetor(vetor1);

        System.out.println("Vetor 2 após a ordenação:");
        exibirVetor(vetor2);

        int[] vetorCombinado = new int[100];
        System.arraycopy(vetor1, 0, vetorCombinado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorCombinado, vetor1.length, vetor2.length);

        Arrays.sort(vetorCombinado);

        System.out.println("\nVetor combinado após a ordenação:");
        exibirVetor(vetorCombinado);
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
