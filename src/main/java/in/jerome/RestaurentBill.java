package in.jerome;

public class RestaurentBill {

	private PaymentApp app;

//	RestaurentBill(PaymentApp ipayment) {
//		this.app = ipayment;
//	} 

	public void setApp(PaymentApp app) {
		this.app = app;
	}

	public void collectBill() {
		System.out.println("collect bill calling ...........");
		boolean payBill = app.payBill();
		if (payBill) {
			System.out.println("payment done...........");
		} else {
			System.out.println("payment failed ");
		}
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * RestaurentBill bill = new RestaurentBill(new DebitcardPay());
	 * bill.collectBill(); }
	 */
}
