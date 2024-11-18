class Produto {
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

class Pedido {
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

public class SuperMercadoProva {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 100, 5.99);
        Pedido pedido = new Pedido(arroz, 20);

        if (pedido.processarPedido()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Falha ao processar o pedido.");
        }
    }
}
