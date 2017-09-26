package IT7320.Assignment3;

public class CalcImplementation {
	
	public void setCalc(CalcInterface calc) {
		this.calc = calc;
	}

	CalcInterface calc;
	
	public int addTwoNums(int a,int b) {
		return calc.add(a,b);
	}
		public int subTwoNums(int x,int y) {
			return calc.sub(x, y);
			
		
	}
		public int multiplyTwoNums(int m,int n) {
			return calc.multiply(m,n);
			

	}
		public double divTwoNums(double p,double q) {
			return calc.division(p, q);
		}
}
