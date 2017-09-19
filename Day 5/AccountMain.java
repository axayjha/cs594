import java.util.*;
class Account
{
	String name;
	int acc_num;
	String type;
	double amount,balance;
	void input()
	{
		System.out.println("Enter the customer's name account number and type of account");
		name=sc.next();
		acc_num=sc.nextInt();
		type=sc.next();
		System.out.println("enter your balance ");
		double balance=sc.nextDouble();
	}
	void deposit()
	{
		System.out.println("enter the deposit");
		double deposit=sc.nextDouble();
		amount=balance+deposit;
	}	
	
	void display()
	{
		System.out.println("customer :"+name+"    "+"account number :"+acc_num+"    "+"type of account "+type);
		System.out.println("Your total balance is :"+amount);
	}
}
class savings extends Account
{
	void disp1()
	{
		System.out.println("sorry , we do not provide cheque book facility");
	}
	void interest_cal()
	{
		double interest;
		System.out.println("enter the time ");
		int time=sc.nextInt();	
		interest=(amount*0.04*time);
	}	
	void withdrawal_sv()
	{
		System.out.println("enter amount to withdraw");
		double wdt=sc.nextDouble();
		amount=amount-wdt;
		System.out.println("after withdrawal your balance is "+amount);
		if(amount<5000.0)
		{
			System.out.println("your balance is falling below the minimum....rs 150 will be deducted");
			amount=amount-150.0;
			System.out.println("youe new balance is :"+amount);
		}
	}
	
}

class currentac extends Account
{
	void disp2()
	{
		System.out.println("we do provide cheque book facility: ");
	}
	void withdrawal_ac()
	{
		System.out.println("enter amount to withdraw");
		double wdt=sc.nextDouble();
		amount=amount-wdt;
		System.out.println("after withdrawal your balance is "+amount);
		if(amount<5000.0)
		{
			System.out.println("your balance is falling below the minimum....rs 150 will be deducted");
			amount=amount-150.0;
			System.out.println("youe new balance is :"+amount);
		}
	}
}
class loan extends Account
{
	int tenure;
	double repayment;
	double baln;
	void calc()
	{	
		withdraw();
		if(amount==baln)
		{
			System.out.println("monthly payment done ");
			tenure--;
			System.out.println("remaining tenures are "+tenure);
			if(tenure==0)
			{
				System.out.println("loan has been cleared");
			}
		}
	}
	void withdraw()
	{
		System.out.println("enter amount to be repayed :");
		repayment=sc.nextDouble();
		baln=amount-repayment;
	}
}
public class AccountMain
{	
	public static void main(String args[])
	{
		BufferedReader sc=new BuferedReader(new InputStreamReader(System.in));
		int ch;
		savings sv=new savings();
		currentac cu=new currentac();
		loan ln=new loan();
		do
		{
		System.out.println("enter choice 1:savings   2:current   3:loan");
		ch=Integer.parseInt(sc.readLine());
		switch (ch)
		{
			case 1:
			{
				sv.disp1();
				sv.interest_cal();
				sv.withdrawal_sv();
				break;
			}
			case 2:
			{
				cu.disp2();
				cu.withdrawal_ac();
				break;
			}
			case 3:
			{
				ln.calc();
				break;
			}
			default:
				System.out.println("invalid choice");
		}
		}while(ch==1||ch==2||ch==3);
	}
}		
		
