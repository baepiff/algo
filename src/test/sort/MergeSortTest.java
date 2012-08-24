package sort;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/02 9:48 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/02
 */
public class MergeSortTest {
    @Test
    public void test87654321() {
        int[] array = {8,7,6,5,4,3,2,1};
        int[] expect = {1,2,3,4,5,6,7,8};
        MergeSort merge = new MergeSort();
        array = merge.diveAndConquer(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test78563412() {

    }

    @Test
    public void test3() {

    }


}
