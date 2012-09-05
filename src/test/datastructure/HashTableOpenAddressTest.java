package datastructure;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/09/05 9:03 $
 *          Copyright: BJ2
 * @since 12/09/05
 */
public class HashTableOpenAddressTest {
    private HashTableOpenAddress table = new HashTableOpenAddress();

    @Test
    public void testInsert() {
        table.insert(1);
        table.insert(2);
        assertThat(table.search(1), is(1));
        assertThat(table.search(2), is(2));
    }

    @Test
    public void testDelete() {
        table.insert(1);
        table.insert(2);
        table.insert(258);
        table.insert(257);
        assertThat(table.search(1), is(1));
        assertThat(table.search(2), is(2));
        assertThat(table.delete(1), is(1));
        assertThat(table.search(1), is(-1));
        assertThat(table.delete(1), is(-1));
        assertThat(table.search(258), is(258));
    }
}
