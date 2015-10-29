package sorting.bubbleSort;

public class ImplementationBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={23,43,76,98,45,12,59,9};
		BubbleSort bs=new BubbleSort(a);
		bs.sort();
		for(int i=0;i<bs.getArray().length;i++){
			System.out.print(bs.getArray()[i]+" ");
		}
	}

}
