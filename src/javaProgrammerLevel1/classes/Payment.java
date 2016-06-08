package javaProgrammerLevel1.classes;

class Payment {
	public double computePayment(
            double loanAmt,
            double rate,
            double futureValue,
            int numPeriods) {
		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest),-numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator)-((futureValue * partial1) / denominator);
	return answer;
	}
	
	public static void main(String[] args){
		Payment p = new Payment();
		System.out.println(p.computePayment(15.5, 80, 50.5, 12));
	}
}
