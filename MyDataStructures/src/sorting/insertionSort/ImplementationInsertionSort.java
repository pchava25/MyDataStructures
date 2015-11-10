package sorting.insertionSort;



public class ImplementationInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,4,7,2,0};
		InsertionSort is=new InsertionSort(a);
		is.sort();
		for(int i=0;i<is.getArray().length;i++){
			System.out.print(is.getArray()[i]+" ");
		}
		System.out.println("");
		int[] b={3,7,4,9,5,2,6,1};
		is.setArray(b);
		is.sort();
		for(int i=0;i<is.getArray().length;i++){
			System.out.print(is.getArray()[i]+" ");
		}
		System.out.println("");
		int[] c={24,13,9,64,7,23,34,47};
		is.setArray(c);
		is.sort();
		for(int i=0;i<is.getArray().length;i++){
			System.out.print(is.getArray()[i]+" ");
		}
	}
}
