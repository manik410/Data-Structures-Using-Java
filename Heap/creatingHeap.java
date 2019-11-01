package heap;
import java.util.*;
public class insert
{
	private int[] heap1;
	private int size;
	public insert(int capacity)
	{
		heap1=new int[capacity];
		int size=0;
	}
	public void insert(int value)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("Heap is full");
		}
		heap1[size]=value;
		fixHeapAbove(size);
		size++;
	}
	public boolean isFull()
	{
		return size==heap1.length;
	}

	public boolean isEmpty()
	{
		return size==0;
	}

	public int delete(int index)
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		int parent=getParent(index);
		int deletedValue=heap1[index];
		heap1[index]=heap1[size-1];
		if(index==0||heap1[index]<heap1[parent])
		{
			fixHeapBelow(index,size-1);
		}
		else
		{
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
	}
	private void fixHeapBelow(int index,int lastHeapIndex)
	{
		int childToSwap;
		while(index<=lastHeapIndex)
		{
			int leftchild=getChild(index,true);
			int rightchild=getChild(index,false);
			if(leftchild<=lastHeapIndex)
			{
				if(rightchild>lastHeapIndex)
				{
					childToSwap=leftchild;
				}
				else
				{
					childToSwap=(heap1[leftchild]>heap1[rightchild]?leftchild:rightchild);
				}
				if(heap1[index]<heap1[childToSwap])
				{
					int tmp=heap1[index];
					heap1[index]=heap1[childToSwap];
					heap1[childToSwap]=tmp;
				}
				else
				{
					break;
				}
				index=childToSwap;
			}
			else
			{
				break;
			}
		}
	}
	public int getParent(int index)
	{
		return (index-1)/2;
	}
	public int getChild(int index,boolean left)
	{
		return 2*index+(left?1:2);
	}
	private void fixHeapAbove(int index)
	{
		int newValue=heap1[index];
		while(index>0&&newValue>heap1[getParent(index)])
		{
			heap1[index]=heap1[getParent(index)];
			index=getParent(index);
		}
		heap1[index]=newValue;
	}
	public void printHeap()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(heap1[i]);
			System.out.print(",");
			
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		insert heap=new insert(10);
		heap.insert(100);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		heap.printHeap();
		heap.delete(1);
		heap.printHeap();
	}
}
