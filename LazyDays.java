// LazyDays

import java.util.Scanner; 

public class LazyDays 
{
	
public static void main(String[] args)
{
	
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int temp;	
	
	
System.out.println("Enter the temperature.");
temp = scan.nextInt();
	
	if(temp >= 95 || temp < 20)
		System.out.println("Visit our shops!");
		else
			if(temp > 80)
				System.out.println("Swimming");
			else if(temp >= 60 && temp < 80)
				System.out.println("Tennis");
			else if(temp >= 40 && temp < 60)
				System.out.println("Golf");
			else if(temp > 20 && temp < 40)
				System.out.println("Skiing");
		
}
}
