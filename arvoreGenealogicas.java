class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome, int idade) {
        this(nome, idade, null, null); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void exibirArvoreGenealogica() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        if (pai != null) {
            System.out.println("Pai: " + pai.getNome());
        } else {
            System.out.println("Pai: Não informado");
        }
        if (mae != null) {
            System.out.println("Mãe: " + mae.getNome());
        } else {
            System.out.println("Mãe: Não informada");
        }
        System.out.println("-----------------------------------");
    }
}

public class arvoreGenealogicas {
    public static void main(String[] args) {
        Pessoa avoPai1 = new Pessoa("João", 75);
        Pessoa avoMae1 = new Pessoa("Ana", 73);
        Pessoa avoPai2 = new Pessoa("Carlos", 80);
        Pessoa avoMae2 = new Pessoa("Maria", 78);

        Pessoa pai = new Pessoa("Pedro", 50, avoPai1, avoMae1);
        Pessoa mae = new Pessoa("Clara", 48, avoPai2, avoMae2);

        Pessoa filho = new Pessoa("Lucas", 20, pai, mae);
        Pessoa filha = new Pessoa("Laura", 18, pai, mae);

        System.out.println("Árvore Genealógica de Lucas:");
        filho.exibirArvoreGenealogica();

        System.out.println("Árvore Genealógica de Laura:");
        filha.exibirArvoreGenealogica();
    }
}
