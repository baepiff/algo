package datastructure;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/22 9:18 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/22
 */
public class StackTest {
    private Stack stack = new Stack();

    @Test(expected = NullPointerException.class)
    public void testEmpty() {
        stack.pop();
    }

    @Test
    public void testPush() {
        stack.push(5);
        assertThat(stack.peek(), is(5));
    }

    @Test
    public void testPop() {
        stack.push(5);
        assertThat(stack.pop(), is(5));
    }

    @Test(expected = StackOverflowError.class)
    public void testStackOverflowError() {
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
    }
}
