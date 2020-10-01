package Thirdquestion;

import java.util.Scanner;

public class PrimeOrNot {

        public static void main(String[] args){
	
	int m=0,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
int	n= sc.nextInt();
m=n/2;

   if(n==1||n==0)
   {
	   System.out.println("Not a Prime Number");
	   
   } else 
   {
	   for (int i=2;i<=m;i++)
	   {
		   if(n%i==0)
		   {
			   System.out.println("Not a Prime Number");
		   }
		   else
		   {
		    flag=1;
		   }break;
	   }
	if (flag==1)
	{
		System.out.println("Number is Prime");
	}
		   
	   }
  
   }
     
}
