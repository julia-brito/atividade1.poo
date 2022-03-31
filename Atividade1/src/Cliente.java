public class Cliente {
    String nome;
    String cpf;
    CartaoDeCredito cartaoDeCredito;
    Conta conta;

    public String retornarDados() {
        String dados = "";

        dados += "----Cliente----";
        dados += "\nNome -> " + nome;
        dados += "\nCPF -> " + cpf;
        dados += "\n" + cartaoDeCredito.retornarDados();
        dados += "\n" + conta.retornarDados();

        return dados;
    }
}
