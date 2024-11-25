import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(101));
        }

        int menor = Collections.min(numeros);
        int maior = Collections.max(numeros);

        System.out.println("Números: " + numeros);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
