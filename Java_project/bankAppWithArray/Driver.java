package bankAppWithArray;

import java.util.Scanner;

public class Driver
{
	private static int totalAccNo=0;
	private static Account[] accounts = new Account[10];
	
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1.Creat Account 2.Deposit 3.Withdraw 4.Balance check 5.exit");
			int ch = sc1.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("Enter Type Of Account  Saving/Loan");
				String type = sc1.next();
				System.out.println("Enter Account Number : ");
				int accNo = sc1.nextInt();
				System.out.println("Enter Account Balance : ");
				double accBal = sc1.nextDouble();
				Account acc = CreatAccount.openAccount(accNo, accBal, type);
				if(acc!=null)
				{
					accounts[totalAccNo]=acc;
					totalAccNo++;
				}
				else
				{
					System.out.println("Ooopsss...Something went Wrong...!!!");
				}
				break;
			case 2 :
				System.out.println("Enter Account Number : ");
				accNo = sc1.nextInt();
				boolean txnStatus = false;
				for(Account a1 :accounts)
				{
					if(a1!=null)
					{
						if(a1.getAccNo()==accNo)
						{
							System.out.println("Enter Amount For Deposit");
							double amt = sc1.nextDouble();
							a1.deposit(amt);
							txnStatus = true;
						}
					}
				}
				if(!txnStatus)
				{
					System.out.println("Invalid Account Number...!!!");
				}
				break;
			case 3 :
				System.out.println("Enter Account Number : ");
				accNo = sc1.nextInt();
			    txnStatus = false;
				for(Account a1 :accounts)
				{
					if(a1!=null)
					{
						if(a1.getAccNo()==accNo)
						{
							System.out.println("Enter Amount For withdraw");
							double amt = sc1.nextDouble();
							a1.withdraw(amt);
							txnStatus = true;
						}
					}
				}
				if(!txnStatus)
				{
					System.out.println("Invalid Account Number...!!!");
				}
				break;
			case 4 :
				System.out.println("Enter Account Number : ");
				accNo = sc1.nextInt();
				txnStatus = false;
				for(Account a1 :accounts)
				{
					if(a1!=null)
					{
						if(a1.getAccNo()==accNo)
						{
							a1.balanceEnquiry();
							txnStatus = true;
						}
					}
				}
				if(!txnStatus)
				{
					System.out.println("Invalid Account Number...!!!");
				}
				break;
			default :
				System.out.println("Thank you For Using The Application...!!!");
				System.exit(0);
			}
			
		}
		
	}

}
