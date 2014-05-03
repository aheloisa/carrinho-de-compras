/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

import java.util.Random;

/**
 *
 * @author arturo
 */
public class Cartao implements SistemaPagamento {
    
    protected int numero;
    protected String senha;
    protected double limite;
    protected double total;

    public void CartaoDeCredito(double total){
        Random rand = new Random(System.currentTimeMillis());
        numero=rand.nextInt();
        this.senha = "1234";
        this.limite = 10000.00;
        this.total = total;
    }
    
    public boolean EfetuaPagamento(double saldo) {
        if(saldo < (this.limite - this.total)){
            this.total = this.total + saldo;
            return true;
        }
        return false;
    }

}
