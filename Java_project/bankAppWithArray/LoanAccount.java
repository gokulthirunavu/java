package bankAppWithArray;

public class LoanAccount implements Account
{
	private int accNo;
	private double accBal;
	public LoanAccount(int accNo, double accBal)
	{
		System.out.println("LoanAccount Created Successfully...");
		this.accNo = accNo;
		this.accBal = accBal;
	}
	public void deposit(double amt)
	{
		System.out.println("Depositing amount in LoanAccount = "+ amt);
		accBal = accBal-amt;
		balanceEnquiry();
	}
	@Override
	public void withdraw(double amt)
	{
		System.out.println("Withdrowing ammount from LoanAccount = "+ amt);
		accBal = accBal+amt;
		balanceEnquiry();
		
	}
	@Override
	public void balanceEnquiry()
	{
		System.out.println("Your Current Balance in LoanAccount = "+accBal);		
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
