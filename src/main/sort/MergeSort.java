package sort;

import java.util.Arrays;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/02 9:30 $
 *          Copyright: BJ2
 * @since 12/08/02
 */
public class MergeSort {
    public int[] diveAndConquer(int[] array) {
        switch (array.length) {
            case 1:
                return array;
            case 2:
                if (array[0] > array[1]) {
                    swap(0, 1, array);
                }
                return array;
            default:
        }

        int mid = (array.length) / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        System.out.print("left:");
        printArray(leftArray);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
        System.out.print("right:");
        printArray(rightArray);

        leftArray = diveAndConquer(leftArray);
        rightArray = diveAndConquer(rightArray);

        int leftIdx = 0;
        int rightIdx = 0;
        int arrayIdx = 0;
        while (leftIdx < leftArray.length && rightIdx < rightArray.length) {
            if (leftArray[leftIdx] < rightArray[rightIdx]) {
                array[arrayIdx] = leftArray[leftIdx];
                arrayIdx++;
                leftIdx++;
            } else {
                array[arrayIdx] = rightArray[rightIdx];
                arrayIdx++;
                rightIdx++;
            }
        }
        while (leftIdx < leftArray.length) {
            array[arrayIdx] = leftArray[leftIdx];
            arrayIdx++;
            leftIdx++;
        }
        while (rightIdx < rightArray.length) {
            array[arrayIdx] = rightArray[rightIdx];
            arrayIdx++;
            rightIdx++;
        }
        printArray(array);
        return array;

    }

    private void printArray(int[] array) {
        System.out.print("array status(");
        for (int i : array) System.out.print(i);
        System.out.println(")");
    }

    private void swap(int leftIdx, int rightIdx, int[] array) {
        array[rightIdx] = array[leftIdx] ^ array[rightIdx];
        array[leftIdx] = array[leftIdx] ^ array[rightIdx];
        array[rightIdx] = array[leftIdx] ^ array[rightIdx];
    }
}
