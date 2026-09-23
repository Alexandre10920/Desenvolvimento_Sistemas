package livros;

public class Principal {

    public static void main(String[] args) {

        Livro livro1 = new Livro(
            "O Hobbit",
            "J.R.R. Tolkien",
            "HarperCollins",
            310,
            1937
        );

        Livro livro2 = new Livro(
            "Dom Casmurro",
            "Machado de Assis",
            "Principis",
            256,
            1899
        );

        livro1.exibirDados();
        livro2.exibirDados();
    }
}
