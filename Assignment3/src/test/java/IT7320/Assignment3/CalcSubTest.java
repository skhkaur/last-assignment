package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcSubTest extends TestCase {
	CalcSub obj1;
	int x,y;
	

	protected void setUp() throws Exception {
		obj1 = new CalcSub();
		x = 5;
		y = 3;
		
		CalcInterface mockObj1 = mock(CalcInterface.class);
		when (mockObj1.sub(x,y)).thenReturn(x-y);
		obj1.setCalcsub(mockObj1);
		
		
	}
	
	public void testSubTwoNums() {
		assertEquals(2,obj1.subTwoNums(x,y));
		
	}

	protected void tearDown() throws Exception {
		obj1 = null;
		x = 0;
		y = 0;
		
		
	}

	

}
