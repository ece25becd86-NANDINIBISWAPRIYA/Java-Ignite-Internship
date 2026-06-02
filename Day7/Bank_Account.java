package JavaIgniteDay7;
class BankAccount{
	private String Accnum;
	private int bal;
	private int depAmt;
	private int wdAmt;
	
	//Setter Method
	public void setAccnum(String ac)
	{
		Accnum = ac;
	}
	
	//Getter Method
	public String getAccnum()
	{
		return Accnum;
	}
	public void setbal(int b)
	{
		bal = b;
	}
	public int getbal()
	{
		return bal;
	}
	public void setdepAmt(int d)
	{
		depAmt = d;
	}
	public int getdepAmt()
	{
		return depAmt;
	}
	public void setwdAmt(int w)
	{
		wdAmt = w;
	}
	public int getwdAmt()
	{
		return wdAmt;
	}
}

public class Bank_Account {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAccnum("25IMWER34BV");
		b1.setbal(56000);
		b1.setdepAmt(23677);
		b1.setwdAmt(32900);
		System.out.println("Account Number: " +b1.getAccnum());
		System.out.println("Balance: " +b1.getbal());
		System.out.println("Deposit Amount: " +b1.getdepAmt());
		System.out.println("Withdraw Amount: " +b1.getwdAmt());
	}
}
