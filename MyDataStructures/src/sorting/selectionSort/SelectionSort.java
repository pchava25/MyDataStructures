package sorting.selectionSort;

import java.util.ArrayList;
import java.util.List;



public class SelectionSort<E extends Comparable<E>>  {
	
	
	public List<E> sort(List<E> sortArray)
	{
		int min=0;
		for(int i=0;i<sortArray.size();i++)
		{
			for(int j=i+1;j<sortArray.size();j++)
			{
				System.out.println(sortArray.get(j).compareTo(sortArray.get(min)));
				if(sortArray.get(j).compareTo(sortArray.get(min))<0)
					{						
					System.out.println("hello 1");
					min=j;
					}
			}
			if(min!=i){
				System.out.println("hello 2");
				swap(sortArray.get(i),sortArray.get(min));
				System.out.println(sortArray.get(i)+" "+sortArray.get(min));
				swap(sortArray,i,min);
				System.out.println(sortArray.get(i)+" "+sortArray.get(min));
			}
			
		}
		for(int i=0;i<sortArray.size();i++)
		{
			System.out.print(sortArray.get(i)+" ");
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
		System.out.println(a+" "+b);
	}
	public <E> void swap(List<E> a, int i, int j) {
        E temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j, temp);
    }
	
}
