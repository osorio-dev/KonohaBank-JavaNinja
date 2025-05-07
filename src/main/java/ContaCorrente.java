public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(Double saldoBancario) {
        super(saldoBancario);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da sua conta corrente é de: " + this.saldoBancario);
    }

    @Override
    public void depositar(Double valor) {

    }
}
