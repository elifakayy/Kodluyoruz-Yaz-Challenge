import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


public class Easy 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("- HELLO, WELCOME TO AGE CALCULATION - ");
		System.out.println("Please Enter Your Date of Birth (YYYY-MM-DD): ");
		String userbirthdate = scanner.next();
		scanner.close();
		
		LocalDate date = LocalDate.parse(userbirthdate);  
		System.out.println("You are " + calculateAge(date)+" years old.");  

	}
	
	public static int calculateAge(LocalDate date)   
	{  
		LocalDate curDate = LocalDate.now();  
		if ((date != null) && (curDate != null)) 
			return Period.between(date, curDate).getYears();  
		 
		else	return 0;  
		 
	}  
}
