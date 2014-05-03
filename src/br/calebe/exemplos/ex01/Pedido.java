/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

/**
 *
 * @author arturo
 */
public class Pedido {
    
    private static int codigo = 0;
    
    private Carrinho carrinho;
    private int cod;
    private String status;
    private final Estoque e = Estoque.getInstance();
    
    public Pedido(Carrinho carrinho){
        this.carrinho = carrinho;
        cod = codigo++;
        status = "Pagamento Pendente";
    }
    
    boolean fecharPedido(Cartao cartao){
        boolean es = false;
        for (Produto produto : carrinho.getProdutos()) {
            es = e.existeProduto(produto);
        }
        if (es){
            double total = carrinho.precoTotal();
            boolean t = cartao.EfetuaPagamento(total);
            if (t) status = "Pago";
            return true;
        }
        return false;
    }
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
