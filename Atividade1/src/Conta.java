public class Conta {
    int numero;
    double saldo;
    double limite;

    public void sacar(double valor) {
		if(valor > saldo){
			System.out.println("Erro!");
		} else {
			saldo = saldo - valor;
		}
	}
	
	//metodo para depositar um valor na conta
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double consultarSaldoDisponivel() {
		return saldo;
	}

	public String retornarDados() {
        String dados = "";

		dados += "----Conta----";
        dados += "\nNúmero de conta -> " + numero;
        dados += "\nSaldo -> R$ " + saldo;
        dados += "\nLimite -> R$ " + limite;
        dados += "\n";

        return dados;
    }

	public String gerarExtrato() {
		String extrato = "";

		extrato += "Saldo da conta -> R$" + saldo;
		extrato += "\nMovimentação dos últimos 7 dias";
		extrato += "\n";

        return extrato;
    }

    public String gerarExtrato(int dias){
		String extrato = "";

		extrato += "Saldo da conta -> R$ " + saldo;
		extrato += "\nMovimentação dos últimos "+ dias + " dias";
		extrato += "\n";

        return extrato;
    }

	public void transferir(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
