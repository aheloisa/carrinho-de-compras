/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

/**
 *
 * @author Sekijima
 */
public class Caneta extends Produto {
    
    private String cor;
    
    public Caneta(String nome, double preco, String cor) {
        super(nome, preco);
        this.cor = cor;
    }
    
    @Override
    public String toString(){
        return "Produto:" + nome + " " + "Cor:"+ cor + " " + "Preço:" + preco;
    }
}
