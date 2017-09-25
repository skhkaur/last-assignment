package IT7320.Assignment3;

public class CalcImplementation {
	
	public void setCalc(CalcInterface calc) {
		this.calc = calc;
	}

	CalcInterface calc;
	
	public int addTwoNums(int a,int b) {
		return calc.add(a,b);
		
	}

}
