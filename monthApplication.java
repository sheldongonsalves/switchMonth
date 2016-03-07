import java.util.Scanner;
public class monthApplication {
    static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		//This program will print 'May' when you run it.
        int month ;
        String monthName;
        System.out.println("Enter the month you want to print:");
        month=sc.nextInt();
        switch (month) {
  
        case 30:
        {
	            
	            monthName = "April ,"+ "June ,"+ "September ," + "November";
	            break;
        }
	            
            
   
            
            
        case 31:
        {
            
	            monthName = "January ," +"March ,"+ "May ,"+ "August ," + "October ," + "December";
	            
	            break;	
        }
            
       case 28: 
            {
               monthName = "February";
            }
           
            
	    default: monthName = "Unknown";
	            System.out.println("There is no such month");
	            break;
            
            
        }
        System.out.println(monthName);

	}

}
