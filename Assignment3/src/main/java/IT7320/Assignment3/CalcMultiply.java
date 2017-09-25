package IT7320.Assignment3;

public class CalcMultiply {
	
CalcInterface calc2;
	
	public int multiplyTwoNums(int m,int n) {
		return calc2.multiply(m,n);
		

}

	public void setCalc(CalcInterface calc2) {
		this.calc2 = calc2;
	}
}
