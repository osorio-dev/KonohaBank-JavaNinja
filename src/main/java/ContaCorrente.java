public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(Double saldoBancario) { super(saldoBancario); }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da sua conta corrente é de: R$ " + this.saldoBancario);
    }

    @Override
    public void depositar(Double valor) {
        this.saldoBancario += valor;
        System.out.println("Valor Depositado com Sucesso!!");
    }
}
