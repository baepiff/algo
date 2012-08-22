package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/22 9:42 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/22
 */
public class Queue {
    private int[] array = new int[10];
    private int tailIdx = -1;
    private int headIdx = 0;

    public void enQueue(int value) {
        if (tailIdx == array.length - 1) tailIdx = -1;
        array[++tailIdx] = value;
    }

    public int deQueue() {
        if (headIdx == array.length - 1) headIdx = 0;
        return array[headIdx++];
    }

}
