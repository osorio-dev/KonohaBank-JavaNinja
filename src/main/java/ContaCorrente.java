public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(Double saldoBancario) {
        super(saldoBancario);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo na conta corrente é de: " + getSaldo() );
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }
}
