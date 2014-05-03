/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arturo
 */
public class Estoque {
    
    private List<Produto> produtos;
    private static Estoque estoque = null;
    
    private Estoque(){
        produtos = new ArrayList<>();
    }
    
    public static Estoque getInstance(){
        if (estoque == null) estoque = new Estoque();
        return estoque;
    }
    
    public void add(Produto produto) {
        produtos.add(produto);
    }
    
    boolean existeProduto(Produto p) {
        return (produtos.contains(p));
    }
    
    void removeEstoque(Produto p){
        produtos.remove(p);
    }
    
}
