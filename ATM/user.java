package ATM;

public class user {
	String name;
	String accno;
	double balance;
	
	user(String name, String accno, double balance){
		this.name=name;
		this.accno=accno;
		this.balance=balance;	
	}
	
	public String getAccno() {
		return accno;
	}
    public double getBalance() {
		return balance;
	}
     public String getName() {
		return name;
	}
     
     public void ToString() {
    	 System.out.println("Name:"+getName()+"\nAccount Number:"+getAccno()+"\nBalance:"+getBalance());
     }
     
     public void withdraw(double withdraw) {
    	      
         if(balance>= withdraw)  
         {  
             balance = balance - withdraw;  
             System.out.println("Please collect your money");  
         }  
         else  
         {  
             System.out.println("Insufficient Balance");  
         }  
     }
     
     public void deposit(double deposit) {
    	 balance = balance + deposit;  
         System.out.println("Your Money has been successfully depsited");  
     }
     
}

