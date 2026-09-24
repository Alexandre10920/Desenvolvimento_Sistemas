package contabancaria;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(int numeroConta, String nomeCliente, double saldo, int diaRendimento) {
        super(numeroConta, nomeCliente, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void calcularNovoSaldo() {
        double novoSaldo = getSaldo() * 1.05;
        System.out.println("Novo saldo com rendimento: R$ " + novoSaldo);
    }
}
