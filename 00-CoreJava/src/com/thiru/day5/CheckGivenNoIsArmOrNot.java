package com.thiru.day5;

public class CheckGivenNoIsArmOrNot {

	public static void main(String[] args) {

//		int n=153,first,mid,last,armNo;
//		
//		int temp=n;
//		last=n%10;
//		first=n/100;
//		mid=n/10%10;
//		System.out.println(first);
//		System.out.println(mid);
//		System.out.println(last);
//		
//		armNo=first*first*first+mid*mid*mid+last*last*last;
//		System.out.println(armNo);
//		
//		if(armNo==temp)
//		{
//			System.out.println("armstrong");
//		}
//		else
//		{
//			System.out.println("not armstron");
//		}
		
		
		
		
		
//		
//		int n=153,sum=0,temp,rem;
//		
//		temp=n;
//		
//		while(n>0)
//		{
//			rem=n%10;
//			sum=sum+rem*rem*rem;
//			n=n/10;
//		}
//		System.out.println("sum :"+sum);
//		System.out.println("temp :"+temp);
//		if(temp==sum)
//		{
//			System.out.println("Armstrong");
//		}
//		else
//		System.out.println("Not Armstrong");
		
		
		
		 int num=1,FNum,SNum,TNum,Arm,count=0;
	       FNum=num/100;   
	       SNum=(num/10)%10;
	       TNum=num%10;
	       Arm=(FNum*FNum*FNum)+(SNum*SNum*SNum)+(TNum*TNum*TNum);
	       System.out.println("Given number is "+(num==Arm)+" ARMSTRONG NUMBER");
	       
	       while(num > 0)
	       {
	    	   num=num/10;
	    	   count=count+1;
	    	   num++;
	    	   
	       }
	       System.out.println(count);
	       if(count==1)
	       {    
	    	   System.out.println("Given number is 3 DIGIT Armstrong number");
	       }
	       else if(count==2)
	       {
	    	   System.out.println("Given number is 2 DIGIT armstrong number");
	       }
	       else if(count==3)
	       {
	    	   System.out.println("Given number is 2 DIGIT armstrong number");
	       }
	       else
	       {
	    	   System.out.println("Invalid input");
	       }
	       
		
		
		
				
		
		
		
	}

}
