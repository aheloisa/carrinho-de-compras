/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.calebe.exemplos.ex02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sekijima
 */
public class EJBStatelessExemploInterfaceTest {
    
    public EJBStatelessExemploInterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of metodo method, of class EJBStatelessExemploInterface.
     */
    @Test
    public void testMetodo() {
        System.out.println("metodo");
        int i = 0;
        EJBStatelessExemploInterface instance = new EJBStatelessExemploInterfaceImpl();
        String expResult = "";
        String result = instance.metodo(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EJBStatelessExemploInterfaceImpl implements EJBStatelessExemploInterface {

        public String metodo(int i) {
            return "";
        }
    }
    
}
