import java.util.*;
public class Mixednumber {

	public static void main(String[] args) {
	Scanner s =new Scanner (System.in);
	System.out.println("enter the number");
	int num =s.nextInt();
	int n =num;
	int f =1,d;
	while(num !=0) {
		d =num%10;
                num =num /10;
		if (n%2 == 0 && d%2 ==1) {
			f=2;
			break;
		}
		else if(n%2 ==1 && d%2 ==0) {
			f=2;
			break;
			
		}
	}
	if(f ==1 && n%2 ==0) 
		System.out.println("full even number");
		
	
	else if(f ==1 && n%2==1)
	System.out.println("full odd number");
	
	else 
	System.out.println("mixed number");

}}