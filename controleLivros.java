import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Pessoa pessoa, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public long diasEmprestimo() {
        return ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "pessoa=" + pessoa +
                ", livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}

public class controleLivros {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcelo Ferreira", "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Sofia Oliveira", "987.654.321-00");

        Livro livro1 = new Livro("Senhor dos Anéis", "J. R. R. Tolkien");
        Livro livro2 = new Livro("Harry Potter", "J. K. Rowling");

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1, LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 15));
        Emprestimo emprestimo2 = new Emprestimo(pessoa2, livro2, LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 20));

        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(emprestimo1);
        emprestimos.add(emprestimo2);

        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
            System.out.println("Dias de empréstimo: " + emprestimo.diasEmprestimo());
            System.out.println("---------------------------------");
        }
    }
}
