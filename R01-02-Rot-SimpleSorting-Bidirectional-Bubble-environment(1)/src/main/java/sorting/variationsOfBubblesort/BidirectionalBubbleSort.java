package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		boolean swapped = true;
		int n = rightIndex;

		while(swapped) {

			swapped = false;
			for (int i = 0; i < rightIndex - i; i++ ){
					if (array[i].compareTo(array[i+1]) > 0){
						Util.swap(array, rightIndex, i);
						swapped = true;
					}

			}

			for (int i = n-1; i>0; i--){
				if (array[i].compareTo(array[i-1]) < 0){
					Util.swap(array, rightIndex, i);
					swapped = true;

				}

			}
		}

		throw new UnsupportedOperationException("Not Implemented yet!");
	}
}
		
