package bankAppWithArray;

public class SavingAccount implements Account
{
	private int accNo;
	private double accBal;
	public SavingAccount(int accNo, double accBal)
	{
		System.out.println("SavingsAccount Created Successfully...");
		this.accNo = accNo;
		this.accBal = accBal;
	}
	public void deposit(double amt)
	{
		System.out.println("Depositing amount in SavingAccount = "+ amt);
		accBal = accBal+amt;
		balanceEnquiry();
	}
	@Override
	public void withdraw(double amt)
	{
		System.out.println("Withdrowing ammount from SavingAccont = "+ amt);
		accBal = accBal-amt;
		balanceEnquiry();
		
	}
	@Override
	public void balanceEnquiry()
	{
		System.out.println("Your Current Balance in SavingAccount = "+accBal);		
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public double getAccBal()
	{
		return accBal;
	}
	public void setAccBal(double accBal) 
	{
		this.accBal = accBal;
	}
}
