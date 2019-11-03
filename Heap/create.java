package heap;
import java.util.*;
public class create 
{
	public int a[];
	public int size=0;
	create(int f)
	{
		a=new int[f];
	}
	void heapify(int[] a,int n,int i)
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
	void insert(int d)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		size=size+1;
		a[size-1]=d;
		heapify(a,size,size-1);
	}
	void printheap()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public boolean isFull()
	{
		return size==a.length;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
		int size=sc.nextInt();
		create c=new create(size);
		for(int i=0;i<size;i++)
		{
			c.insert(sc.nextInt());
		}
		c.printheap();
	}

}
