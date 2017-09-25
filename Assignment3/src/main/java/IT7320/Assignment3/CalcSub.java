package IT7320.Assignment3;

public class CalcSub {
CalcInterface calcsub;
	
	
	public void setCalcsub(CalcInterface calcsub) {
		this.calcsub = calcsub;
	}




	public int subTwoNums(int x,int y) {
		return calcsub.sub(x, y);
		
	}
	
}



