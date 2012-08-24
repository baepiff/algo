package sort;

import common.Swap;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/08 9:48 $
 *          Copyright: BJ2
 * @since 12/08/08
 */
public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private int[] quickSort(int[] array, int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int pivot = partition(array, startIdx, endIdx);
            array = quickSort(array, startIdx, pivot - 1);
            array = quickSort(array, pivot + 1, endIdx);
        }
        return array;
    }

    private int partition(int[] array, int startIdx, int endIdx) {
        int lastValue = array[endIdx];
        int i = startIdx - 1;
        for (int j = startIdx; j < endIdx; j++) {
            if (array[j] < lastValue) {
                i++;
                Swap.swap(i, j, array);
            }
        }
        Swap.swap(++i, endIdx, array);
        return i;
    }

    private void printArray(int[] array) {
        for(int value: array) {
            System.out.print(value);
        }
        System.out.println("");

    }
}
