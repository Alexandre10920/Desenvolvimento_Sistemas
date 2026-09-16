package academia;

public class AlunoAcademia {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    
    public AlunoAcademia(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public boolean ehMenorDeIdade() {
        return idade < 18;
    }

    
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f%n", calcularIMC());

        if (ehMenorDeIdade()) {
            System.out.println("Tem direito ao desconto: Sim");
        } else {
            System.out.println("Tem direito ao desconto: Não");
        }

        System.out.println("-------------------------");
    }
}
