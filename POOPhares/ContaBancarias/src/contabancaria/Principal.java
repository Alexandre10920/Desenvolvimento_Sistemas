package contabancaria;

public class Principal {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca(101, "Joao", 1000, 10);

        ContaEspecial especial = new ContaEspecial(202, "Maria", 500, 1000);

        System.out.println("CONTA POUPANCA");
        System.out.println("Cliente: " + poupanca.getNomeCliente());
        System.out.println("Conta: " + poupanca.getNumeroConta());

        poupanca.consultarSaldo();
        poupanca.depositar(500);
        poupanca.sacar(200);
        poupanca.calcularNovoSaldo();
        poupanca.consultarSaldo();

        System.out.println();

        System.out.println("CONTA ESPECIAL");
        System.out.println("Cliente: " + especial.getNomeCliente());
        System.out.println("Conta: " + especial.getNumeroConta());

        especial.consultarSaldo();
        especial.depositar(300);
        especial.sacar(500);
        especial.sacar(1000);
        especial.sacar(500);
        especial.consultarSaldo();
    }
}
