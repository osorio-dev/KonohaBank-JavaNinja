public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Double saldoBancario) {
        super(saldoBancario);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo na conta poupança é de: " + getSaldo() );
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }

}
