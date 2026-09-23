package livros;

public class LivroDeLivraria extends Livro {

    private double preco;
    private int quantidadeEstoque;

    public LivroDeLivraria(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao, double preco, int quantidadeEstoque) {
        super(titulo, autor, editora, numeroPaginas, anoPublicacao);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.println("-------------------------");
    }
}
