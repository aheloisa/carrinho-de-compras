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
public class Livro extends Produto {
    
    private String autor;
    
    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Produto:" + nome + " " + "Autor:"+ autor + " " + "Preço:" + preco;
    }
    
}
