package lampada;

public class Lampada {

    private String modelo;
    private double preco;
    private int potencia;
    private boolean ligada;

    public Lampada() {
        modelo = "Genérica";
        preco = 0.0;
        potencia = 0;
        ligada = false;
    }

    public Lampada(String modelo, double preco, int potencia) {
        this.modelo = modelo;
        this.preco = preco;
        this.potencia = potencia;
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Potência: " + potencia + "W");

        if (ligada) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }
    }
}
