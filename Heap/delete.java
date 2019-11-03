package heap;
import java.util.*;
public class delete 
{
	int[] a;
	int size=0;
	delete(int d)
	{
		a=new int[d];
	}
	void heapify(int[] a,int n,int i)
	{
		int parent=(i-1)/2;
		if(a[parent]>0)
		{
			if(a[i]>a[parent])
			{
				int tem=a[i];
				a[i]=a[parent];
				a[parent]=tem;
				heapify(a,size,parent);
			}
		}
	}
	void insert(int d)
	{
		size=size+1;
		a[size-1]=d;
		heapify(a,size,size-1);
	}
	void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void del(int index)
	{
		if(index==size-1)
		{
			size=size-1;
			return;
		}
		else
		{
			a[index]=a[size-1];
			size=size-1;
			heapify1(a,size,size-1);
		}
	}
	void heapify1(int[] a,int n,int i)
	{
		int parent=(i-1)/2;
		if(parent>=0&&a[parent]>0)
		{
			if(a[i]>a[parent])
			{
				int tem=a[i];
				a[i]=a[parent];
				a[parent]=tem;
				heapify1(a,size,i-1);
			}
			else
			{
				heapify1(a,size,i-1);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		delete d=new delete(size);
		for(int i=0;i<size;i++)
		{
			d.insert(sc.nextInt());
		}
		d.print();
		System.out.println();
		System.out.println("Enter the index of node to be deleted");
		int index=sc.nextInt();
		if(index>=size)
		{
			System.out.println("Error");
			System.exit(0);
		}
		else
		{
			d.del(index);
			d.print();
		}
		}

}
