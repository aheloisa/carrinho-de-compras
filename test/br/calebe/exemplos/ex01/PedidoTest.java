/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

import br.calebe.exemplos.ex01.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.jmock.*;

/**
 *
 * @author Felipe
 */
public class PedidoTest {
    
    @Test
    public void TestaPagamento(){
        Estoque e = Estoque.getInstance();
        Carrinho carrinho = new Carrinho();
        Produto produto = new Caneta("Bic", 1.00, "Azul");
        e.add(produto);
        carrinho.add(produto);
        Pedido pedido = new Pedido(carrinho);
        final Mockery mockery = new Mockery();
        final Cartao cartao = mockery.mock(Cartao.class);
        boolean test;
        test = pedido.fecharPedido(cartao);
        assertTrue(test);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
