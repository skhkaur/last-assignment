package IT7320.Assignment3;

public class CalcImplementation {
	
	public void setCalc(CalcInterface calc) {
		this.calc = calc;
	}

	CalcInterface calc;
	
	public int addTwoNums(int a,int b) {
		return calc.add(a,b);
	}
		public int subTwoNums(int a,int b) {
			return calc.sub(a, b);
			
		
	}
		public int multiplyTwoNums(int a,int b) {
			return calc.multiply(a,b);
			

	}
		public double divTwoNums(double a,double b) {
			return calc.division(a, b);
		}
}
