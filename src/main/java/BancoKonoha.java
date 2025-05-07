import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoKonoha {
    private final List<ContaBancaria> contaBancariaList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void startSystemBank() {

        int optionSelect;

        do {
            System.out.println("Konoha Bank");
            System.out.println("Selecione a operação Desejada");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Consultar Saldo");
            System.out.println("3 - Depositar na Conta");
            System.out.println("4 - Transferir dinheiro para outra Conta");
            System.out.println("5 - Encerrar o Atendimento");

            optionSelect = scanner.nextInt();
            scanner.nextLine();

            switch (optionSelect) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    if (contaBancariaList.isEmpty()) {
                        System.out.println("Não a conta registrada para Consultar Saldo");
                        break;
                    }

                    contaBancariaList.getFirst().consultarSaldo();
                    break;
                case 3:
                    if (contaBancariaList.isEmpty()) {
                        System.out.println("Não a conta para ser Realizada o Deposito");
                        break;
                    }

                    System.out.println("Digite o Valor a ser Depositado em Conta:");
                    Double valor = scanner.nextDouble();
                    contaBancariaList.getFirst().depositar(valor);
                    break;
            }

        } while (optionSelect != 5);
    }

    private void createAccount() {

        System.out.println("Selecione o Tipo da Conta");
        System.out.println("0 - Corrente");
        System.out.println("1 - Poupanca");

        int optionSelect = scanner.nextInt();
        scanner.nextLine();

        switch (TipoConta.values()[optionSelect]) {
            case CORRENTE:
                ContaCorrente contaCorrente = new ContaCorrente(0.0);
                contaBancariaList.add(contaCorrente);
                break;

            case POUPANCA:
                ContaPoupanca contaPoupanca = new ContaPoupanca(0.0);
                contaBancariaList.add(contaPoupanca);
                break;
        }

        System.out.println("Conta Criada com Sucesso!!");
        startSystemBank();
    }
}
