package datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/29 9:09 $
 *          Copyright: BJ2
 * @since 12/08/29
 */
public class HashTableTest {

    private HashTable table = new HashTable();

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
        table.insert(257);
        assertThat(table.search(1), is(1));
        assertThat(table.search(2), is(2));
        assertThat(table.delete(1), is(1));
        assertThat(table.search(1), is(-1));
    }




}
