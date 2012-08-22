package sort;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/16 9:49 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/16
 */
public class CountingSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int maxValue = findMaxValue(array); //O(n)
        return countingSort(array, maxValue);
    }

    private int findMaxValue(int[] array) {
        int maxValue = 0;
        for (int value: array) {
            if (value > maxValue) maxValue = value;
        }
        return maxValue;
    }

    private int[] countingSort(int[] array, final int maxValue) {
        //initialize tempArray to 0
        int[] tempArray = new int[maxValue + 1];
        //count up
        for (int value : array) tempArray[value] = tempArray[value] + 1; //O(n)
        for (int i = 1; i < tempArray.length; i++) tempArray[i] = tempArray[i] + tempArray[i - 1]; //O(n)
        int[] result = new int[array.length];
        for (int j = array.length - 1; j >= 0; j--) { //O(n)
            result[tempArray[array[j]] - 1] = array[j];
            tempArray[array[j]] = tempArray[array[j]] - 1;
        }

        return result;

    }
}
