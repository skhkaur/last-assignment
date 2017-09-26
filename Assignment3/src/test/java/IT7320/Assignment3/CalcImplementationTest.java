package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	 CalcImplementation obj;
	 int a, b;
	 

	protected void setUp() throws Exception {
		obj = new CalcImplementation ();
		a = 6;
		b = 2;
		
		CalcInterface mockObj =	mock(CalcInterface.class);
		
//		CalcInterface mockObj = Mockito.mock(CalcInterface.class);
		when(mockObj.add(a, b)).thenReturn(a+b);
		obj.setCalc(mockObj);
		
		
		when (mockObj.sub(a,b)).thenReturn(a-b);
		obj.setCalc(mockObj);
		
		
		when(mockObj.multiply(a, b)).thenReturn(a*b);
		obj.setCalc(mockObj);
		
		when( mockObj.division(a, b)).thenReturn(((double) a/ (double)b));
		obj.setCalc(mockObj);
			
    		
	}
	
	
    public void testAddTwoNums() {
    	assertEquals(8,obj.addTwoNums(a, b));
    }
    	
    	public void testSubTwoNums() {
    		assertEquals(4,obj.subTwoNums(a,b));
    		
    	}
    	public void testMultiplyTwoNums() {
    		assertEquals(12,obj.multiplyTwoNums(a, b));
    		
    	}

        public void testDivTwoNums() {
        	assertEquals(3.0,obj.divTwoNums(a, b));
        	
    		
    		
    	}

    	
    	
	protected void tearDown() throws Exception {
	obj =null;
	a = 0;
	b = 0;
	}

	
}
