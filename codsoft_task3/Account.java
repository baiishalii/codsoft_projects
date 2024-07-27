package codsoft_task3;
import java.util.Scanner; 
public class Account extends user {

	Account(String name, String accno, double balance) {
		super(name, accno, balance);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc= new Scanner(System.in);  
        
      System.out.println("Automated Teller Machine");  
 
      user user=new user("Ashish Nayak","01A45",1879.70);
      user.toString();
      
      while(true)  
      {  
                   
    	  System.out.println("Choose 1 for Withdraw");  
          System.out.println("Choose 2 for Deposit");  
          System.out.println("Choose 3 for Check Balance");  
          System.out.println("Choose 4 for EXIT");  
          System.out.print("Choose the operation you want to perform:");  
            
          int choice = sc.nextInt(); 
          
          switch(choice)  
          {  
              case 1:  
      System.out.print("Enter money to be withdrawn:"); 
      double withdraw = sc.nextDouble();
      user.withdraw(withdraw);
      System.out.println("Balance : "+user.getBalance());
      break;  
 
              case 2:               
      System.out.print("Enter money to be deposited:");  
      double deposit = sc.nextInt();  
      user.deposit(deposit);
      System.out.println("Balance : "+user.getBalance());
      break;  
 
              case 3:   
      System.out.println("Balance : "+user.getBalance());  
      break;  
 
              case 4:
       System.exit(0);
       break;
      
              default:
       System.out.println("invalid choice");
       continue;
          }
          
          break;
          
      }  
  }  
}  
