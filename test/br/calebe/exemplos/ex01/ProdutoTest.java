/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sekijima
 */
public class ProdutoTest {
    
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPreco method, of class Produto.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Produto instance = null;
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testGetPrecoValor() {
        Produto produto = new Produto("Livro", 12.0);
        assertEquals(12.0, produto.getPreco());
    }
    
    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals_Object() {
        Object obj = null;
        Produto instance = null;
        assertTrue(instance.equals(obj));
    }

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals_Produto() {
        Produto nulo = null;
        Produto obj = new Produto("Livro", 15.0);
        Produto instance = new Produto("Livro", 15.0);
        assertTrue(instance.equals(obj));
        assertFalse(instance.equals(nulo));
    }
    
}
