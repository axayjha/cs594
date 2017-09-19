class account
{
	String customer_name;
	String account_number;
	String account_type;
	float balance;

	public void set_name(String name) {customer_name = name;}
	public void set_acc_number(String acc_number){account_number = acc_number;}
	public void set_acc_type(String type) {account_type = type;}
	public void set_balance(float value){balance = value;}

	public String get_name(){return customer_name;}
	public String get_acc_number(){return account_number;}
	public String get_acc_type() {return account_type;}
	public float get_balance(){return balance;}

	
	public void deposit(float amount)
	{
		balance+=amount;
	}

	public static void main(String args[])
	{        
		savings_account s1 = new savings_account();  
		s1.set_name("Akshay");
		s1.set_acc_number("SBI20170201");
		s1.set_acc_type("Savings");
		s1.set_balance(40000);
		System.out.println("Customer name: "+ s1.get_name());
		System.out.println("Account number: "+ s1.get_acc_number());
		System.out.println("Account type: " + s1.get_acc_type());
		System.out.println("Current balance: " + s1.get_balance());
	
		s1.withdraw(35000);
		s1.check_balance();
		s1.deposit(2000);
		s1.compute_interest(10);
		s1.check_balance();
	}


}

class savings_account extends account
{
	float interest;
	void compute_interest(int month)
	{
		interest = balance + (balance *month* 4/1200);
		System.out.println("Interest: " + interest);
		
	}
	void withdraw(float x)
	{			
		balance -= x;
	}
	
	void check_balance()
	{
		if(balance <= 5000)
		{
			System.out.println("Account balance too low.");
			System.out.println("Rs. 150 fine charged. This will be added to your balance");
			balance -= 150;
		}
		System.out.println("Current balance: " + balance);
	}
	

}
class current_account extends account
{
	void add_cheque(float amount)
	{
		balance += amount;
	}
	void withdraw(float amount)
	{			
		balance -= amount;
	}
	
	void check_balance()
	{
		if(balance < 1000)
		{
			System.out.println("Rs. 150 fine charged. This will be added to your balance");
			balance -= 150;
		}
		System.out.println("Current balance: " + balance);
	}

}
class loan_account extends account
{
	float loan_amount;
	int tenure;
	float repayment_value = loan_amount/tenure;
	void check_repayment(int rd, int rm, int ry, int cd, int cm, int cy)
	{
		if(loan_amount == 0)
		{
			System.out.println("Loan repaid");
		}
		if(ry>cy)
		{
			if(rm>cm)
			{
				if(rd<cd)
				{
					System.out.println("Rs 200 fine imposed");
					balance -= 200;
				}
			}		
			else 
			{
				System.out.println("Rs 200 fine imposed");
				balance -= 200;
			}
		}
		else 
		{
			System.out.println("Rs 200 fine imposed");
			balance -= 200;
		}
		
	}
	void repay()
	{
		System.out.println("repaid");
		loan_amount -= repayment_value;
		tenure--;
		if(loan_amount == 0)
		{
			System.out.println("Loan repaid");
		}
	}

}
