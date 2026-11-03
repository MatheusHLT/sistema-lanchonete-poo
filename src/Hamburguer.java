class Hamburguer {
    public String nome;
    public String descricao;
    public double preco;

    public Hamburguer() {
    }

    public String exibir() {
        return "Nome: " + nome + "\nDescrição: " + descricao + "\nPreço: R$ " + preco;
    }

    public String exibirUtil() {
        return "Nome: " + nome + " - " + "Preço: R$ " + preco;
    }

}
