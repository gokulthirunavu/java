package bankAppWithArray;

public class CreatAccount
{
	public static Account openAccount(int accNo,double accBal,String type)
	{
		Account acc = null;
		if(type.equals("saving"))
		{
			acc = new SavingAccount(accNo,accBal);
		}
		else if(type.equals("loan"))
		{
			acc = new LoanAccount(accNo,accBal);
		}
		return acc;
	}

}
