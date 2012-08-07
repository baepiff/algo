package sort;

import common.Swap;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/03 9:28 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/03
 */
public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int outer = array.length; outer > 1; outer --) {
            for(int i = 1; i < outer; i++) {
                if (array[i - 1] > array[i]) Swap.swap(i - 1, i, array);
            }
        }
        return array;
    }
}
