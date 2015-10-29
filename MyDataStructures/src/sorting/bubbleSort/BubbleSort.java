package sorting.bubbleSort;

public class BubbleSort {

	private int[] array;
	
	public BubbleSort(int[] array)
	{
		this.array=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			this.array[i]=array[i];
		}
	}
	public int[] sort()
	{
		for(int i=array.length;i>0;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					swap(j,j+1);					
				}				
			}
		}
		return array;
	}
	
	private void swap(int a,int b)
	{
		int temp;
		temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	public void setArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
			this.array[i]=array[i];
	}
	public int[] getArray()
	{
		return array;
	}
}
