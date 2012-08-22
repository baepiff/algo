package datastructure;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/22 9:42 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/22
 */
public class QueueTest {
    private Queue queue = new Queue();

    @Test
    public void testEnqueue() {
        queue.enQueue(1);
        assertThat(queue.deQueue(), is(1));
    }
    @Test
    public void testFIFO() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        assertThat(queue.deQueue(), is(1));
        assertThat(queue.deQueue(), is(2));
        assertThat(queue.deQueue(), is(3));
        assertThat(queue.deQueue(), is(4));
    }

}
