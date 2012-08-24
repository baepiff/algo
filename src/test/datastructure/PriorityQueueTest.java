package datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/08 12:53 $
 *          Copyright: BJ2
 * @since 12/08/08
 */
public class PriorityQueueTest {
    private PriorityQueue queue;

    @Before
    public void setUp() {
        queue = new PriorityQueue();
        int[] array = {6,5,3,8,7,4,2};
        for (int a: array) {
            queue.insert(a);
        }
    }

    @Test
    public void testInsert() {
        queue.insert(1);
        assertThat(queue.min(), is(1));
    }

    @Test
    public void testMin() {
        assertThat(queue.min(), is(2));
    }

    @Test
    public void testExtractMin() {
        assertThat(queue.extractMin(), is(2));
        assertThat(queue.min(), is(3));
        assertThat(queue.extractMin(), is(3));
        assertThat(queue.min(), is(4));
        assertThat(queue.extractMin(), is(4));
        assertThat(queue.min(), is(5));
        assertThat(queue.extractMin(), is(5));
        assertThat(queue.min(), is(6));
        assertThat(queue.extractMin(), is(6));
        assertThat(queue.min(), is(7));
        assertThat(queue.extractMin(), is(7));
        assertThat(queue.min(), is(8));

    }

}
