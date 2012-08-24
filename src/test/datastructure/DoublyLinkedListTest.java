package datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/24 9:31 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/24
 */
public class DoublyLinkedListTest {
    private DoublyLinkedList list = new DoublyLinkedList();

    @Before
    public void setUp() {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void testSearch() {
        assertThat(list.search(2).getValue(), is(2));
        assertThat(list.search(2).getPrev().getValue(), is(1));
        assertThat(list.search(2).getNext().getValue(), is(3));
    }

    @Test
    public void testDeleteHead() {
        DoublyLinkedListNode node = list.delete(1);
        assertThat(node.getValue(), is(1));
        assertThat(list.search(1), nullValue());
    }

    @Test
    public void testDeleteMiddle() {
        DoublyLinkedListNode node = list.delete(2);
        assertThat(node.getValue(), is(2));
        assertThat(list.search(1).getValue(), is(1));
        assertThat(list.search(1).getNext().getValue(), is(3));
    }
}
