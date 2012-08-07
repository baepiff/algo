package common;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/03 9:31 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/03
 */
public class Swap {
    private Swap(){};
    public static void swap(int leftIdx, int rightIdx, int[] array) {
        array[rightIdx] = array[leftIdx] ^ array[rightIdx];
        array[leftIdx] = array[leftIdx] ^ array[rightIdx];
        array[rightIdx] = array[leftIdx] ^ array[rightIdx];
    }

}
