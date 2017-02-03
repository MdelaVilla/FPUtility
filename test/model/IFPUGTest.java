package model;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IFPUGTest {
    
    public IFPUGTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class IFPUG.
     */
    /* @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        IFPUG expResult = null;
        IFPUG result = IFPUG.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of addTransaction method, of class IFPUG.
     */
    /* @Test
    public void testAddTransaction() {
        System.out.println("addTransaction");
        Transaction transaction = null;
        IFPUG instance = null;
        instance.addTransaction(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of getFeatures method, of class IFPUG.
     */
    /* @Test
    public void testGetFeatures() {
        System.out.println("getFeatures");
        IFPUG instance = null;
        int[] expResult = null;
        int[] result = instance.getFeatures();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of getTransactions method, of class IFPUG.
     */
    /* @Test
    public void testGetTransactions() {
        System.out.println("getTransactions");
        IFPUG instance = null;
        List<Transaction> expResult = null;
        List<Transaction> result = instance.getTransactions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of setFeatures method, of class IFPUG.
     */
    /* @Test
    public void testSetFeatures() {
        System.out.println("setFeatures");
        int[] features = null;
        IFPUG instance = null;
        instance.setFeatures(features);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of setTransactions method, of class IFPUG.
     */
    /* @Test
    public void testSetTransactions() {
        System.out.println("setTransactions");
        List<Transaction> transactions = null;
        IFPUG instance = null;
        instance.setTransactions(transactions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } *

    /**
     * Test of getSummary method, of class IFPUG.
     */
    @Test
    public void testGetSummary() {
        System.out.println("getSummary");
        
        IFPUG instance = IFPUG.getInstance();
        Transaction t1 = new Transaction("Consulta_Prueba", Type.EQ, Complexity.C);
        Transaction t2 = new Transaction("Entrada_Prueba", Type.EI, Complexity.S);
        Transaction t3 = new Transaction("Salida_Prueba", Type.EO, Complexity.S);
        Transaction t4 = new Transaction("FL.Interno_Prueba", Type.ILF, Complexity.M);
        Transaction t5 = new Transaction("FL.Externo_Prueba", Type.ELF, Complexity.C);
        Transaction t6 = new Transaction("Salida2_Prueba", Type.EO, Complexity.S);
        instance.addTransaction(t1);
        instance.addTransaction(t2);
        instance.addTransaction(t3);
        instance.addTransaction(t4);
        instance.addTransaction(t5);
        instance.addTransaction(t6);
        int[][] expResult = new int[5][3];
        int[][] result = instance.getSummary();
        
        for (int[] row : expResult)
            Arrays.fill(row, 0);
        
        expResult[0][0] = 1;
        expResult[1][0] = 2;
        expResult[2][1] = 1;
        expResult[3][2] = 1;
        expResult[4][2] = 1;
        
        assertArrayEquals(expResult, result);
    }
    
}
