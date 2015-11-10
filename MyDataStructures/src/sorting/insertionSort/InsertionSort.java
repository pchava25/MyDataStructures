package sorting.insertionSort;

public class InsertionSort {

	private int[] array;
	public InsertionSort(int[] array)
	{
		setArray(array);
	}
	public int[] sort()
	{
		int j,x;
		for(int i=0;i<array.length;i++)
		{
			//System.out.println("loop i="+i);
			j=i;
			x=array[i];
			while(j>0 && array[j-1]>x)
			{
				array[j]=array[j-1];				
				j--;
			}
			array[j]=x;			
		}			
		return array;
	}	
	public void setArray(int[] array)
	{
		this.array=new int[array.length];
		for(int i=0;i<array.length;i++)
			this.array[i]=array[i];
	}
	public int[] getArray()
	{
		return array;
	}
}
