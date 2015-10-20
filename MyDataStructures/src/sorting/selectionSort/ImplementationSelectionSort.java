package sorting.selectionSort;

import java.util.ArrayList;
import java.util.List;

public class ImplementationSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={64,25,12,22,11};
		List<Integer> e=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			e.add(a[i]);
		}
		SelectionSort<Integer> s=new SelectionSort<Integer>();
		//if(e.length!=0)
		List<Integer> r=s.sort(e);
		System.out.print("\n");
		for(int i=0;i<r.size();i++)
		{
			System.out.print(r.get(i)+" ");
		}
	}

}
