package sort;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/01 9:23 $
 *          Copyright: BJ2
 * @since 12/08/01
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        return insertionSort(array);
    }

    private int[] insertionSort(int[] array) {
        int currentValue = 0;
        for (int currentIdx = 1; currentIdx < array.length; currentIdx++) {
            currentValue = array[currentIdx];
            for (int leftSideIdx = currentIdx - 1; leftSideIdx >= 0; leftSideIdx--) {
                if (currentValue < array[leftSideIdx]) {
                    array[leftSideIdx + 1] = array[leftSideIdx];
                    array[leftSideIdx] = currentValue;
                } else {
                    continue;
                }
            }
        }
        return array;
    }

}
