// Code to check all primes numbers bewteen 2-1000 and put them in array list and display the array list 
//and then print the sum of elements of array list.
package collections;
import java.util.*;
public class Demo2 
{
	ArrayList al=new ArrayList();
	int sum=0;
	void input()
	{
		int i,j,count=0;
		for(i=2;i<=1000;i++)
		{
			count=0;
			for(j=2;j<=i/2;j++)
			{
				if((i%j)==0)
				{
					count=2;
					break;
				}
			}
			if(count==0)
			{
				al.add(i);
				sum=sum+i;
			}
		}
	}
	int sum()
	{
		System.out.println(al);
		return sum;
	}
	public static void main(String args[])
	{
		Demo2 a=new Demo2();
		a.input();
		int x=a.sum();
		System.out.println("The sum of the prime numbers is : "+a.sum);
	}

}
