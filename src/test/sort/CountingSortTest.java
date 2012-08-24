package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static sort.CommonConstants.*;
/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/16 9:50 $
 *          Copyright: BJ2
 * @since 12/08/16
 */
public class CountingSortTest {

    @Test
    public void test65318742() {
        int[] array = {6,5,3,1,8,7,4,2};
        Sort sort = new CountingSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test6() {
        int[] array = {6};
        int[] expect = {6};
        Sort sort = new CountingSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test12345678() {
        int[] array = {1,2,3,4,5,6,7,8};
        Sort sort = new CountingSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test87654321() {
        int[] array = {8,7,6,5,4,3,2,1};
        Sort sort = new CountingSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

    @Test
    public void test25302303() {
        int[] array = {2,5,3,0,2,3,0,3};
        int[] expect = {0,0,2,2,3,3,3,5};
        Sort sort = new CountingSort();
        array = sort.sort(array);
        assertThat(array, is(expect));
    }

}
