package academia;

public class Principal {

    public static void main(String[] args) {

        
        AlunoAcademia ana = new AlunoAcademia(
                "Ana", 17, 60, 1.65
        );

        AlunoAcademia bruno = new AlunoAcademia(
                "Bruno", 25, 80, 1.80
        );

        
        System.out.println("DADOS DOS ALUNOS");
        System.out.println("=========================");

        ana.exibirDados();
        bruno.exibirDados();

     
        bruno.setPeso(78);

        System.out.println("BRUNO APÓS ALTERAR O PESO");
        System.out.println("=========================");

        bruno.exibirDados();
    }
}