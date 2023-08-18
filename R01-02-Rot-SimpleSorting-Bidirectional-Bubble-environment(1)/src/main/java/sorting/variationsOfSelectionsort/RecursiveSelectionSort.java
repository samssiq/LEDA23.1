package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		 recursiveSelectionSort(array,leftIndex,rightIndex);
	}

	private void recursiveSelectionSort(T[] array, int leftIndex, int rightIndex) {
		if (array == null || leftIndex < 0 || rightIndex >= array.length || leftIndex >= rightIndex){
			return;
		}
			
			for (int i = leftIndex; i < rightIndex; i++){
				int menorIndex = i;
					
					for (int j = i + 1; j <= rightIndex; j++) {
						if(array[menorIndex].compareTo(array[j]) > 0) {
						menorIndex = j;
						}
					}
					
					Util.swap(array, i, menorIndex);
				}
			 	recursiveSelectionSort(array,leftIndex+1,rightIndex);
			}
		}
