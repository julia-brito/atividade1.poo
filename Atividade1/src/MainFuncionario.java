import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		Funcionario f = new Funcionario();

        System.out.print("Indique o nome -> ");
        f.nome = teclado.nextLine();
        
        System.out.print("Indique o cpf -> ");
        f.cpf = teclado.nextLine();

        System.out.print("Indique o salario -> R$ ");
        f.salario = teclado.nextDouble();
        
        f.aumentarSalario(50);
        f.ajustarValeRefeicao(10);
        System.out.println(f.retornarDados());
    }
}
