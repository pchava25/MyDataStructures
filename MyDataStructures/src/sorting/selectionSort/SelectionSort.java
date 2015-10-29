package sorting.selectionSort;

import java.util.List;



public class SelectionSort<E extends Comparable<E>>  {
	
	
	public List<E> sort(List<E> sortArray)
	{
		int min=0;
		for(int i=0;i<sortArray.size();i++)
		{
			min=i;
			for(int j=i+1;j<sortArray.size();j++)
			{				
				if(sortArray.get(j).
						compareTo(sortArray.get(min))<0)
					{
					min=j;
					}
			}
			if(min!=i){
				swap(sortArray,i,min);
			}
			
		}
		return sortArray;
	}
	public void swap(E a,E b)
	{
		System.out.println(a+" "+b);
		E temp;
		temp=a;
		a=b;
		b=temp;
	}
	private <E> void swap(List<E> a,
			int i, int j) {
        E temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j, temp);
    }
	
}
