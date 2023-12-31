package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;

import util.Util;
public class RecursiveBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	/**
	 * Implementação recursiva do bubble sort. Você deve implementar apenas esse
	 * método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		RecursiveBubbleSort(array, leftIndex, rightIndex);
	}

	public void RecursiveBubbleSort(T[]array, int leftIndex, int rightIndex){
		if (array == null || leftIndex < 0 || rightIndex >= array.length || leftIndex >= rightIndex){
			return;
		}

		if (leftIndex == rightIndex){
			return;
		}
		boolean swapped;
		swapped = false;
		for (int i = 0; i < rightIndex - i; i++ ){
			if (array[i].compareTo(array[i+1]) > 0){
				Util.swap(array, rightIndex, i);
				swapped = true;
			}

		}

		if(!swapped){
			return;
		}
		RecursiveBubbleSort(array, leftIndex, rightIndex);

	}
}
