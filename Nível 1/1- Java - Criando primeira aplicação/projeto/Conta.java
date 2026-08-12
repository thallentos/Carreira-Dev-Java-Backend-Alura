package projeto;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcoes = 0;
        double saldo = 1000.00;
        while (opcoes != 4) {

            String cabecalho = """


            
                    ******************************************
                    Dados iniciais do cliente:
    
                    Nome:            Hannah Franco Marques
                    Tipo conta:      Corrente
                    Saldo inicial:   R$()
                    ******************************************
    
                    Operações
    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
    
                    """;
            System.out.println(cabecalho.replace("()", String.valueOf(saldo)));
            System.out.println("Digite a opção desejada: ");
            opcoes = leitura.nextInt();
                
            if (opcoes == 1) {
                System.out.println("Seu saldo atual é: R$" + saldo);
            } else if (opcoes == 2) {
                System.out.println("Digite o valor que deseja receber: ");
                double receberValor = leitura.nextDouble();
                saldo += receberValor;
                System.out.println("Valor recebido com sucesso. Novo saldo: R$" + saldo);
            } else if (opcoes == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferirValor = leitura.nextDouble();
                if (transferirValor > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldo -= transferirValor;
                    System.out.println("Transferência realizada com sucesso. Novo saldo: R$" + saldo);
                }
            } else if (opcoes == 4) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
