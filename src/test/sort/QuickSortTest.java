package sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/08 9:48 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/08
 */
public class QuickSortTest {
    @Test
    public void test65318742() {
        int[] array = {6,5,3,1,8,7,4,2};
        int[] expect = {1,2,3,4,5,6,7,8};
        Sort sort = new QuickSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test6() {
        int[] array = {6};
        int[] expect = {6};
        Sort sort = new QuickSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test12345678() {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] expect = {1,2,3,4,5,6,7,8};
        Sort sort = new QuickSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

}
