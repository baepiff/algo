package sort;

import common.Swap;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/06 9:33 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/06
 */
public class HeapSort {
    public int[] heapSort(int[] array) {
        array = buildMaxHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            Swap.swap(0, i, array);
            maxHeapify(array, 0, i);
        }
        return array;
    }

    private int[] buildMaxHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0 ; i--) {
            maxHeapify(array, i, array.length);
        }
        return array;
    }

    private void maxHeapify(int[] array, int idx, int length) {
        int adaptorIdx = (idx + 1) * 2;
        int leftIdx = adaptorIdx - 1;
        int rightIdx = adaptorIdx;
        int largestIdx = 0;
        if (leftIdx < length &&
                array[leftIdx] > array[idx]) {
            largestIdx = leftIdx;
        } else {
            largestIdx = idx;
        }
        if (rightIdx < length &&
                array[rightIdx] > array[largestIdx]) {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx) {
            Swap.swap(idx, largestIdx, array);
            maxHeapify(array, largestIdx, length);
        }

    }
}
