package IT7320.Assignment3;

public class Calcdiv {
	CalcInterface Calcdiv;



public double divTwoNums(double p,double q) {
	return Calcdiv.division(p, q);
}



public void setCalcdiv(CalcInterface calcdiv) {
	Calcdiv = calcdiv;
}
	
}