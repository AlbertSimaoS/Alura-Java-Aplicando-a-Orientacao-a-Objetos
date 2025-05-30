import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 1000;
        String extrato;
        int escolha = 0;
        Scanner leitura = new Scanner(System.in);

        extrato = String.format("""
        *****************
        Dados Iniciais do cliente:
        
        
        Nome:                     Albert Simão Soares
        Tipo da Conta:            Corrente
        Saldo Inicial:            R$%.2f
        ****************
        """, saldo);
        System.out.println(extrato);

        String operacoes;
        operacoes = """
        \nOperações:
        
        1- Consultar Saldo
        2- Receber Valor
        3- Transferir Valor
        4- Sair
        """;
        System.out.println(operacoes);
        System.out.println("Escolha uma Operação para ser realizada: ");
        escolha = leitura.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                extrato = String.format("""
                *****************
                Dados do cliente:
                
                
                Nome:                     Albert Simão Soares
                Tipo da Conta:            Corrente
                Saldo Atual:              R$%.2f
                ****************
                """, saldo);
                System.out.println(extrato);

            } else if (escolha == 2) {
                System.out.println("Informe o valor recebido:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Valor recebido com sucesso!");
                System.out.println("Saldo atual: R$" + saldo);

            } else if (escolha == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para a transferência.");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada com sucesso.");
                    System.out.println("Saldo atual: R$" + saldo);
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(operacoes);
            System.out.println("Escolha uma Operação para ser realizada: ");
            escolha = leitura.nextInt();
        }

        System.out.println("Você saiu do sistema. Até mais!");
    }
}
