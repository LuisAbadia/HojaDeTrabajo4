/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LuisEstuardo
 */
public class FactoryTest {
    
    public FactoryTest() {
        Factory testFactory= new Factory();
        setUpClass();
    }
    
    @BeforeClass
    public static void setUpClass() {
        Factory testFactory= new Factory();
        testFactory.getLista(1);
        testFactory.getStack(15, 50);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStack method, of class Factory.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        int opcion = 0;
        int opcion1 = 0;
        Factory instance = new Factory();
        StackAbstract expResult = null;
        StackAbstract result = instance.getStack(opcion, opcion1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class Factory.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        int opcion1 = 0;
        Factory instance = new Factory();
        ListaAbstract expResult = null;
        ListaAbstract result = instance.getLista(opcion1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
