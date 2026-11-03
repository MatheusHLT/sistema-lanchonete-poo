class Pedido {
    public int numeroPedido;
    public String nomeCliente;
    public Hamburguer item1;
    public Hamburguer item2;
    public boolean pago = false;

    public Pedido() {
    }

    public Double calcularTotal() {
        return item1.preco + item2.preco;
    }
    
    public String pagar() {
        pago = true;
        return "Status: PAGO";
    }
    
    public String exibirPedido() {
        return "===== PEDIDO #42 =====\nCliente: " + nomeCliente + "\nItem 1: " + item1.exibirUtil() + "\nItem 2: " + item2.exibirUtil() + "\nTotal: R$ " + calcularTotal(); 
    }

}
