import java.util.Scanner;

public class grade_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your marks in all 5 subjects");
		
		Double[] sub=new Double[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter your marks out of 100:");
			sub[i]=scan.nextDouble();
			if (sub[i]>100 || sub[i]<0)
				System.out.println("invalid mark");
		}
		
		
		double Total_marks=0;
		for(int i=0;i<5;i++) {
			Total_marks=Total_marks +sub[i];
		}
		System.out.println("Total marks in all 5 subjects are:"+ Total_marks);
		

		double Avg_percent= Total_marks/5;
		System.out.println("Percentage in all 5 subjects are:"+Avg_percent);
		
		
	    if (Avg_percent>=90)
	    	System.out.print("Grade:O");
	    else if(Avg_percent>=80 && Avg_percent<90)
    	     System.out.print("Grade:A");
	    else if(Avg_percent>=70 && Avg_percent<80)
   	     System.out.print("Grade:B");
	    else if(Avg_percent>=60 && Avg_percent<70)
   	     System.out.print("Grade:C");
	    else if(Avg_percent>=50 && Avg_percent<60)
   	     System.out.print("Grade:D");
	    else if(Avg_percent>=40 && Avg_percent<50)
   	     System.out.print("Grade:E");
	    else 
   	     System.out.print("Grade:F");
		

	}

}
