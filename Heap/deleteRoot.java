package heap;
import java.util.*;
public class deleteRoot 
{
	int[] a;
	int size=0;
	deleteRoot(int d)
	{
		a=new int[d];
	}
	void insert(int d)
	{
		size=size+1;
		a[size-1]=d;
		heapify(a,size,size-1);
	}
	void heapify(int []a,int n,int i)
	{
		int parent=(i-1)/2;
		if(a[parent]>0)
		{
			if(a[i]>a[parent])
			{
				int temp=a[i];
				a[i]=a[parent];
				a[parent]=temp;
			heapify(a,n,parent);
			}
		}
	}
	void heapify1(int []a,int n,int i)
	{
		int parent=(i-1)/2;
		if(parent>=0&&a[parent]>0)
		{
			if(a[i]>a[parent])
			{
				int temp=a[i];
				a[i]=a[parent];
				a[parent]=temp;
				heapify1(a,n,i-1);
			}
			else
			{
				heapify1(a,n,i-1);
			}
		}
	}
	void delete()
	{	
		int lastElement=a[size-1];
		a[0]=lastElement;
		size=size-1;
		System.out.println(size);
		heapify1(a,size,size-1);
	}
	void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		deleteRoot r=new deleteRoot(size);
		for(int i=0;i<size;i++)
		{
			r.insert(sc.nextInt());
		}
		r.print();
		System.out.println();
		r.delete();
		r.print();
	}

}
