public class CartaoDeCredito {
    int numero;
    double totalFatura;

    public double consultarFatura() {
        return totalFatura;
    }

    public String retornarDados() {

        String cartao = "";

        cartao += "----Cartão----";
        cartao += "\nNúmero ->" + numero;
        cartao += "\nFatura -> R$ " + totalFatura;
        return cartao;

    }
}
