package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/17 9:49 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/17
 */
public class LinkedListNode {
    private LinkedListNode nextNode;
    private int value;

    public LinkedListNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    public LinkedListNode(int value, LinkedListNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
