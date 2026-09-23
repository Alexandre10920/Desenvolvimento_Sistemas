package lampada;

public class Principal {

    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada("LED", 29.90, 12);

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        lampada2.ligar();
        lampada2.mostrarEstado();

        lampada2.desligar();
        lampada2.mostrarEstado();
    }
}
