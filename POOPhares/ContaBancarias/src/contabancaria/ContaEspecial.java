package contabancaria;

public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public ContaEspecial(int numeroConta, String nomeCliente, double saldo, double limiteCredito) {
        super(numeroConta, nomeCliente, saldo);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor <= getSaldo() + limiteCredito) {
            alterarSaldo(-valor);
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo + limite insuficiente.");
        }
    }
}
