package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/24 9:33 $
 *          Copyright: BJ2
 * @since 12/08/24
 */
public class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    public void add(int value) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if (head == null) {
            head = node;
            head.setPrev(null);
        } else if (head != null && tail == null) {
            head.setNext(node);
            tail = node;
            tail.setPrev(head);
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public DoublyLinkedListNode search(int value) {
        DoublyLinkedListNode temp = head;
        while (temp.getNext() != null) {
            if (temp.getValue() == value) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public DoublyLinkedListNode delete(int value) {
        DoublyLinkedListNode temp = head;
        while (temp.getNext() != null) {
            if (temp.getValue() == value) {
                if (temp.getPrev() != null) {
                    temp.getPrev().setNext(temp.getNext());
                }
                if (temp.getNext() != null) {
                    temp.getNext().setPrev(temp.getPrev());
                }
                if (temp.equals(head)) head = temp.getNext();
                if (temp.equals(tail)) tail = temp.getPrev();
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
