import java.util.Scanner;

public class Produtos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe o preço unitário do produto (R$): ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = precoUnitario * quantidade;

        double desconto = 0;

        if (quantidade >= 1 && quantidade <= 10) {
            desconto = 0;
        } else if (quantidade >= 11 && quantidade <= 20) {
            desconto = 0.10;
        } else if (quantidade >= 21 && quantidade <= 50) {
            desconto = 0.20;
        } else if (quantidade > 50) {
            desconto = 0.25;
        }

        double valorComDesconto = valorTotal - (valorTotal * desconto);

        System.out.printf("\nProduto: %s\n", nomeProduto);
        System.out.printf("Quantidade comprada: %d\n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorComDesconto);

        scanner.close();
    }
}
