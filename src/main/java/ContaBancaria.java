import java.util.UUID;

public abstract class ContaBancaria implements Conta {
    private final String id = UUID.randomUUID().toString();
    private Double saldoBancario;

    public ContaBancaria(Double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    public Double getSaldo() {
        return this.saldoBancario;
    }
}
