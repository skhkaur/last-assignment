package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcdivTest extends TestCase {
	Calcdiv obj3;
	double p, q;
	

	protected void setUp() throws Exception {
		obj3 = new Calcdiv  ();
		p = 6;
		q = 2;
		
		CalcInterface mockObj3 =	mock(CalcInterface.class);
		when( mockObj3.division(p, q)).thenReturn(((double) p/ (double)q));
		obj3.setCalcdiv(mockObj3);
			
	}
	
    public void testDivTwoNums() {
    	assertEquals(3.0,obj3.divTwoNums(p, q));
    	
		
		
	}


	protected void tearDown() throws Exception {
		obj3 = null;
		p = 0;
		q = 0;
		
	}

	
}
