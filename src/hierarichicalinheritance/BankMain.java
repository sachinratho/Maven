package hierarichicalinheritance;

public class BankMain {
	
	public static void main (String [] args ) {
		BankMoneyCheking obj = new BankMoneyCheking();
		obj.USERNAME();
		obj.POASSWORD();
		obj.login();
		obj.BankMiniStatement();
		obj.PASSBOOK();
		// by doing this kind of inheritance we can acess the properties of superclass into any subclass

		BankFixDeposit object = new BankFixDeposit();
		object.USERNAME();
		object.POASSWORD();
		object.login();
		object .Saving();
		
		BankMoneyTransfer aa= new BankMoneyTransfer();
		aa.USERNAME();
		aa.POASSWORD();
		aa.login();
		aa.RTGS();
		aa.QuickTransfer();
	}
}