package class_program;

public class BankAccount {

	private double amount=45678;
	private int pin;
	private long accountNumber=435678998765l;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void getBalance(int pin) {
		if(this.pin==pin) {
			System.out.println
		("your current balance is :"+amount);
		}else
		{
			System.out.println("enter wrong pin");
		}
	}
}
