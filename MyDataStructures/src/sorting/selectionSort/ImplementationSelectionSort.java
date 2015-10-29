package sorting.selectionSort;

import java.util.ArrayList;
import java.util.List;

public class ImplementationSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={56,567,23,5,88};		
		List<Integer> e=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			e.add(a[i]);
		}
		SelectionSort<Integer> s=new SelectionSort<Integer>();
		
		List<Integer> r=s.sort(e);
		
		for(int i=0;i<r.size();i++)
		{
			System.out.print(r.get(i)+" ");
		}
		
		System.out.println();
		
		
		String[] str={"Cat","Tiger","Dog","Elephant","Lion","Fox"};
		List<String> strList=new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			strList.add(str[i]);
		}
		SelectionSort<String> sstr=new SelectionSort<String>();
		
		List<String> rstr=sstr.sort(strList);
		
		for(int i=0;i<rstr.size();i++)
		{
			System.out.print(rstr.get(i)+" ");
		}
	}

}
