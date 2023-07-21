package Powerfunction;
import java.util.Scanner;

public class ImplementPowerfunction {

	 static int power(int a,int b,int c){
		 int power=0;
	        if (b==0){
	            return 1;
	        }
	        if(b==1) {
	        	return a;
	        }
	        	return power(a,b/2,c);
	 }
	        	
	      
	    public static void main(String[] args) {
			
			Scanner n = new Scanner (System.in);
			int a = n.nextInt();
			int b=n.nextInt();
			int c=n.nextInt();
			
			System.out.println(power(a,b,c));
		}
	}