package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/22 9:14 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/22
 */
public class Stack {
    private int[] array = new int[10];
    private int topIdx = -1;

    public void push(int value) {
        if (topIdx >= array.length - 1) throw new StackOverflowError();
        array[++topIdx] = value;
    }

    public int peek() {
        return array[topIdx];
    }

    public int pop() {
        if (topIdx < 0) throw new NullPointerException();
        int result = array[topIdx--];
        //array[topIdx--] = 0;
        return result;
    }
}
