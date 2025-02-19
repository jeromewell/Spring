package in.jerome;

public class CreditcardPay implements PaymentApp {

	@Override
	public boolean payBill() {
		System.out.println("credit card payment.......");
		return false;
	}
	
	CreditcardPay(){
		System.out.println("Credit card object created....");
	}

}
