package encapsulation;

//Bean
class Account
{
	private double bal;
	
	//write
	//update the new value to the data member
	public void setBal(double bal)
	{
		if(bal > 0)
		{
		 this.bal = bal;
		}
		else
		{
		  System.out.println("INVALID AMT FOR TRANSACTION");
		}
	}
	
	//read
	//returns the current value of the data member
	public double getBal()
	{
		return bal;
	}
}

//Service
class Transaction
{
	public static void deposit(double amt,Account ref)
	{
		double currBal = ref.getBal();//get current bal
		double newBal = currBal + amt;//calculate new bal
	  	ref.setBal(newBal);//update the new bal
	}
	
	public static void withdraw(double amt,Account ref)
	{
		double currBal = ref.getBal();
		double newBal = currBal - amt;
		ref.setBal(newBal);
	}
	
	public static void showbal(Account ref) 
	{
        double currBal = ref.getBal();
        System.out.println("Current Bal : "+currBal);
	}
}


public class Mainclass 
{
	public static void main(String[] args) 
	{
       Account a1 = new Account();
       Account a2 = new Account();
       
       
       Transaction.deposit(-1000,a1);
       Transaction.showbal(a1);
       
       Transaction.showbal(a2);
      
	}
}







