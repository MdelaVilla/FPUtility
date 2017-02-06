package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalcComplexityEI method, of class Calculator. All right.
     */
    @Test
    public void testCalcComplexityEI() {
        System.out.println("CalcComplexityEI");
        
        int det = 16;
        int ftr = 3;
        Complexity expResult = Complexity.C;
        Complexity result = Calculator.CalcComplexityEI(det, ftr);
        int value = result.compareTo(expResult);
        
        assertEquals(value, 0);
    }

    /**
     * Test of CalcComplexityELF method, of class Calculator. All right.
     */
    @Test
    public void testCalcComplexityELF() {
        System.out.println("CalcComplexityELF");
        
        int det = 51;
        int ret = 6;
        Complexity expResult = Complexity.C;
        Complexity result = Calculator.CalcComplexityELF(det, ret);
        int value = result.compareTo(expResult);
        
        assertEquals(value, 0);
    }

    /**
     * Test of CalcComplexityEO method, of class Calculator. All right.
     */
    @Test
    public void testCalcComplexityEO() {
        System.out.println("CalcComplexityEO");
        
        int det = 20;
        int ftr = 4;
        Complexity expResult = Complexity.C;
        Complexity result = Calculator.CalcComplexityEO(det, ftr);
        int value = result.compareTo(expResult);
        
        assertEquals(value, 0);
    }

    /**
     * Test of CalcComplexityEQ method, of class Calculator. All right.
     */
    @Test
    public void testCalcComplexityEQ() {
        System.out.println("CalcComplexityEQ");
        
        int det_in = 5;
        int ret_in = 0;
        int det_out = 8;
        int ret_out = 4;
        Complexity expResult = Complexity.C;
        Complexity result = Calculator.CalcComplexityEQ(det_in, ret_in, det_out, ret_out);
        int value = result.compareTo(expResult);
        
        assertEquals(value, 0);
    }

    /**
     * Test of CalcComplexityILF method, of class Calculator. All right.
     */
    @Test
    public void testCalcComplexityILF() {
        System.out.println("CalcComplexityILF");
        
        int det = 51;
        int ret = 6;
        Complexity expResult = Complexity.C;
        Complexity result = Calculator.CalcComplexityILF(det, ret);
        int value = result.compareTo(expResult);
        
        assertEquals(value, 0);
    }
    
}
