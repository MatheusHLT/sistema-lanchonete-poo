public class App {
    public static void main(String[] args) throws Exception {
    Hamburguer smashClassico = new Hamburguer();
    
    smashClassico.nome = "Smash Clássico";
    smashClassico.descricao = "Pão brioche, smash, queijo, alface, tomate";
    smashClassico.preco = 28.90;
    
    Hamburguer vegano = new Hamburguer();
    vegano.nome = "Green Byte";
    vegano.descricao = "Pão integral, burger de grão-de-bico, rúcula";
    vegano.preco = 32.50;
    
    Pedido pedidoA = new Pedido();
    pedidoA.numeroPedido = 42;
    pedidoA.nomeCliente = "Ana Lima";
    pedidoA.item1 = smashClassico;
    pedidoA.item2 = vegano;
    
    System.out.println(pedidoA.exibirPedido());
    System.out.println(pedidoA.pagar());
    }
}
