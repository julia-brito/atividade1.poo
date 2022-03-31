public class Funcionario {
    String cpf;
    String nome;
    double salario;
    double valeRefeicao = 550;

    public String retornarDados() {
        String dados = "";

        dados += "Nome -> " + nome;
        dados += "\nCPF -> " + cpf;
        dados += "\nSalário -> R$ " + salario;
        dados += "\nVale refeição -> R$ " + valeRefeicao;
        dados += "\n";

        return dados;
    }

    public void aumentarSalario(double porcentagem) {
        salario = salario * (1 + (porcentagem / 100));
    }

    public void ajustarValeRefeicao(double porcentagem) {
        valeRefeicao = valeRefeicao * (1 + (porcentagem / 100));
    }
}
