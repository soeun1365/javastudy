package quiz3;

public class SalesMan extends SalaryMan {

	//field
	private int salesAmount;	//판매 실적
	private double incentive;	//인센티브(%단위 사용)
	
	//constructor
		public SalesMan(String name, int salary) {
		super(name, salary);
	}

	//method
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount > 1000) {
			setIncentive(0.07);	// 7% 인센티브
		}else {
			setIncentive(0.05);	// 5% 인센티브
		}
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public int getPay() {
		return 	super.getPay() + getSalesPay() ;	//기본급(super) + 판매수당(판매실적 * 인센티브);
	}
	
	public int getSalesPay() {
		return (int)(salesAmount * incentive);
	}
	
	@Override
	public void info() {
		super.info();	//직원명, 기본급
		System.out.println("판매수당: " + getSalesPay());
		System.out.println("총합: " + getPay());
	}
}
