public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Double saldoBancario) {
        super(saldoBancario);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da sua conta poupança é de: " + this.saldoBancario);
    }

    @Override
    public void depositar(Double valor) {

    }
}
