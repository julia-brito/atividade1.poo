import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		Cliente c = new Cliente();

        System.out.print("Indique o nome do cliente -> ");
        c.nome = teclado.nextLine();
        
        System.out.print("Indique o CPF do cliente -> ");
        c.cpf = teclado.nextLine();

        Conta conta = new Conta();

        System.out.print("Indique o numero(Conta) -> ");
        conta.numero = teclado.nextInt();
        
        System.out.print("Indique o saldo(Conta) -> R$ ");
        conta.saldo = teclado.nextDouble();

        c.conta = conta;

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();

        System.out.print("Indique o numero(Cartão) -> ");
        cartaoDeCredito.numero = teclado.nextInt();
        
        System.out.print("Indique o valor de fatura(Cartão) -> ");
        cartaoDeCredito.totalFatura = teclado.nextDouble();

        c.cartaoDeCredito = cartaoDeCredito;
        
        String dados = c.retornarDados();
        System.out.println(dados);

        conta.depositar(450);
        conta.sacar(200);
        
        System.out.println("Saldo = R$ "+conta.consultarSaldoDisponivel());

        Conta conta2 = new Conta();
        conta2.numero = 2;
        conta2.saldo = 380;
        
        conta.transferir(conta2, 10);

        System.out.println("Transferencia realizada para conta 2");

        System.out.println("Saldo atual da conta 2: R$" + conta2.consultarSaldoDisponivel());

        System.out.println("Saldo = R$ "+conta.consultarSaldoDisponivel());

        int opcao = 2;

        while(opcao != 0 && opcao != 1){
            System.out.println("Indique a opção do extrato -> (0)Padrão de 7 dias, (1)Vou indicar");
            opcao = teclado.nextInt();

            if(opcao != 0 && opcao != 1){
                System.out.println("Opcao inválida!");
            }
        }

        int dias;
        if(opcao == 0){
            System.out.println(conta.gerarExtrato());
        } else {
            System.out.print("Indique a quantidade de dias: ");
            dias = teclado.nextInt();
            System.out.println(conta.gerarExtrato(dias));
        }

        
    }
}
