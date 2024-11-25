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

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

class Usuario {
    private String nome;
    private String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public long diasEmprestimo() {
        return ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "usuario=" + usuario +
                ", livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}

public class controleLivros {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Marcelo Ferreira", "123.456.789-00");
        Usuario usuario2 = new Usuario("Sofia Oliveira", "987.654.321-00");

        Livro livro1 = new Livro("Senhor dos Anéis", "J. R. R. Tolkien");
        Livro livro2 = new Livro("Harry Potter", "J. K. Rowling");

        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1, LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 15));
        Emprestimo emprestimo2 = new Emprestimo(usuario2, livro2, LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 20));

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
