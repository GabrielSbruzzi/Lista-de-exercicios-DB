import java.util.ArrayList;
import java.util.List;

public class SuperMercadoProva {

    static class Produto {
        private String nome;
        private int quantidadeEstoque;
        private double preco;

        public Produto(String nome, int quantidadeEstoque, double preco) {
            this.nome = nome;
            this.quantidadeEstoque = quantidadeEstoque;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        public double getPreco() {
            return preco;
        }

        public boolean diminuirEstoque(int quantidade) {
            if (quantidadeEstoque >= quantidade) {
                quantidadeEstoque -= quantidade;
                return true;
            } else {
                System.out.println("Estoque insuficiente para o produto: " + nome);
                return false;
            }
        }
    }

    static class Pedido {
        private Produto produto;
        private int quantidade;

        public Pedido(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public boolean processarPedido() {
            return produto.diminuirEstoque(quantidade);
        }
    }

    public static double calcularTroco(double valorPago, double valorTotal) {
        if (valorPago < valorTotal) {
            System.out.println("Valor pago é insuficiente.");
            return 0;
        }
        return valorPago - valorTotal;
    }

    public static List<String> calcularTrocoEmNotas(double troco) {
        List<String> notasMoedas = new ArrayList<>();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        double[] moedas = {0.50, 0.25, 0.10, 0.05, 0.01};

        // Calculando as notas
        for (int nota : notas) {
            while (troco >= nota) {
                troco -= nota;
                notasMoedas.add(nota + " nota(s) de R$ " + nota);
            }
        }

        for (double moeda : moedas) {
            while (troco >= moeda) {
                troco -= moeda;
                troco = Math.round(troco * 100.0) / 100.0;
                notasMoedas.add(moeda + " moeda(s) de R$ " + moeda);
            }
        }

        return notasMoedas;
    }

    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 100, 5.99);
        Produto feijao = new Produto("Feijão", 50, 7.50);

        Pedido pedidoArroz = new Pedido(arroz, 20);
        Pedido pedidoFeijao = new Pedido(feijao, 10);

        System.out.println("Processando pedido de arroz...");
        if (pedidoArroz.processarPedido()) {
            System.out.println("Pedido de arroz processado com sucesso!");
        } else {
            System.out.println("Falha ao processar pedido de arroz.");
        }

        System.out.println("Processando pedido de feijão...");
        if (pedidoFeijao.processarPedido()) {
            System.out.println("Pedido de feijão processado com sucesso!");
        } else {
            System.out.println("Falha ao processar pedido de feijão.");
        }

        double valorTotal = 45.50;
        double valorPago = 50.00;

        double troco = calcularTroco(valorPago, valorTotal);
        System.out.println("Troco a ser devolvido: R$ " + troco);

        List<String> trocoEmNotas = calcularTrocoEmNotas(troco);
        System.out.println("Troco em notas e moedas:");
        for (String item : trocoEmNotas) {
            System.out.println(item);
        }
    }
}
