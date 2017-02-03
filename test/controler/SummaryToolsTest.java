package controler;

import java.util.Arrays;
import model.IFPUG;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SummaryToolsTest {
    
    public SummaryToolsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of totalize method, of class SummaryTools.
     */
    @Test
    public void testTotalize() {
        System.out.println("totalize");
        
        int[][] summary = new int[5][3];
        int[][] heft = IFPUG.heft;
        int[] expResult = {3, 8, 10, 10, 6, 37};
        
        for (int[] row : summary)
            Arrays.fill(row, 0);
        
        summary[0][0] = 1;
        summary[1][0] = 2;
        summary[2][1] = 1;
        summary[3][2] = 1;
        summary[4][2] = 1;
        
        int[] result = SummaryTools.totalize(summary, heft);
        
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of sum method, of class SummaryTools.
     */
    /* @Test
    public void testSum() {
        System.out.println("sum");
        int[] a = null;
        int expResult = 0;
        int result = SummaryTools.sum(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
