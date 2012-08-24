package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/24 9:28 $
 *          Copyright: BJ2
 * @since 12/08/24
 */
public class DoublyLinkedListNode {

    private DoublyLinkedListNode prev;
    private DoublyLinkedListNode next;
    private int value;

    public DoublyLinkedListNode(int value) {
        this.value = value;
        prev = null;
        next = null;
    }

    public DoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode prev) {
        this.prev = prev;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
