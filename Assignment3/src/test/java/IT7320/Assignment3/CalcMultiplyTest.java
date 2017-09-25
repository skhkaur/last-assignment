package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcMultiplyTest extends TestCase {
	CalcMultiply obj2;
	 int m, n;


	protected void setUp() throws Exception {
		obj2 = new  CalcMultiply ();
		m = 3;
		n = 5;
		
		CalcInterface mockObj2 =	mock(CalcInterface.class);
		when(mockObj2.multiply(m, n)).thenReturn(m*n);
		obj2.setCalc(mockObj2);
	}

	//CalcInterface mockObj2 = mock(CalcInterface.class);
	
	

	public void testMultiplyTwoNums() {
		assertEquals(15,obj2.multiplyTwoNums(m, n));
		
	}
	
	
   protected void tearDown() throws Exception {
	   obj2 =null;
		m = 0;
		n = 0;
		
	}

}
