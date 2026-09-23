package livros;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private int numeroPaginas;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("-------------------------");
    }
}
