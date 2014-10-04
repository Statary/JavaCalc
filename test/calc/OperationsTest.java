package calc;

import calc.Operations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OperationsTest {
  private double a;
  private double b;
  
  public OperationsTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    a = 22;
    b = 2;
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testSum() {
    double expResult = 24.0;
    double result = Operations.sum(a, b);
    assertEquals(expResult, result, 0.0);
  }

  @Test
  public void testSub() {
    double expResult = 20.0;
    double result = Operations.sub(a, b);
    assertEquals(expResult, result, 0.0);
  }

  @Test
  public void testMul() {
    double expResult = 44.0;
    double result = Operations.mul(a, b);
    assertEquals(expResult, result, 0.0);
  }

  @Test
  public void testDiv() {
    double expResult = 11.0;
    double result = Operations.div(a, b);
    assertEquals(expResult, result, 0.0);
  }

  @Test
  public void testDivDouble() {
    double x = 13;
    double y = 3;
    double expResult = 4.333333333333333;
    double result = Operations.div(x, y);
    assertEquals(expResult, result, 0.0);
  }

  @Test
  public void testDoubleDivByZero() {
    double x = 122;
    double y = 0;
    double expResult = new Double("Infinity");
    double result = Operations.div(x, y);
    assertEquals(expResult, result, 0.0);
  }
  
  @Test
  public void testIntDivByZero() {
    int x = 122;
    int y = 0;
    try {
      Operations.div(x, y);
      fail("Should be divide by aero exception!");
    } catch ( ArithmeticException e) {
    }
  }
  
}
