import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o limite do cartão: ");
            double limite = leitura.nextDouble();
            CartaoDeCredito cartao = new CartaoDeCredito(limite);

            int sair = 1;
            while (sair != 0) {
                System.out.println("Digite a descrição da compra: ");
                String descricao = leitura.next();

                System.out.println("Digite o valor da compra: ");
                double valor = leitura.nextDouble();

                Compra compra = new Compra(descricao, valor);
                boolean compraRealizada = cartao.lancaCompra(compra);

                if (compraRealizada) {
                    System.out.println("Compra realizada com sucesso!");
                    System.out.println("Digite 0 para sair ou 1 para continuar");
                    sair = leitura.nextInt();
                } else {
                    System.out.println("Saldo insuficiente para realizar a compra.");
                }
            }
        }
    }
}
