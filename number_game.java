import java.util.*;

public class number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int round=0;
		boolean cont=true;
		
		while(cont!=false){
			
			round++;
		
		int randomNum=(int)(Math.random()*101);
		
		int count=0;
		
		do {
			System.out.println("Enter a number from 1 to 100:");
		    int input=sc.nextInt();
		    
		    if(randomNum==input) {
		    	System.out.println("CORRECT GUESS!");
		    	break;
		    }
		    else if(input>randomNum && input<(randomNum+5)) {
		    	System.out.println("Close guess"+"\nTry Again");
		    	count++;
		    	continue;
		    }
		    else if(input<randomNum && input>(randomNum-5)) {
		    	System.out.println("Close guess"+"\nTry Again");
		    	count++;
		    	continue;
		    }
		    
		    else {
		    	System.out.println("Try Again");
		    	count++;
		    	continue;
		    }
 
		}while(count<3);
		
		do {
			
		System.out.println("Do you wish to continue: y or n");
		char choice=sc.next().charAt(0);
		
		if(choice=='y') {
			System.out.println("ROUND "+ ++round);
			cont=true;
		}
		else if(choice=='n') {
			System.out.println("THANK YOU");
			cont=false;
		}
		else 
			 System.out.println("enter valid choice");
		
        if (choice=='y')
			break;
        
		} while(cont!=false) ;
		
		
			
		
        
		}
	}

}
