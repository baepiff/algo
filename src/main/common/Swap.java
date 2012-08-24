package common;

import datastructure.Node;

import java.util.List;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/03 9:31 $
 *          Copyright: BJ2
 * @since 12/08/03
 */
public class Swap {
    private Swap(){};
    public static void swap(int leftIdx, int rightIdx, int[] array) {
        int temp = array[leftIdx];
        array[leftIdx] = array[rightIdx];
        array[rightIdx] = temp;
    }
    public static void swap(int leftIdx, int rightIdx, List<Node> list) {
        Node temp = list.get(leftIdx);
        list.set(leftIdx, list.get(rightIdx));
        list.set(rightIdx, temp);
    }
}
