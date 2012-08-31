package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/29 9:08 $
 *          Copyright: BJ2
 * @since 12/08/29
 */
public class HashTable {
    LinkedListNode[] table = new LinkedListNode[256];

    public void insert(int value) {
        int index = hash(value);
        LinkedListNode node = new LinkedListNode(value);
        if (table[index] == null) table[index] = node;
        else {
            LinkedListNode head = table[index];
            while (head.getNextNode() != null) head = head.getNextNode();
            head.setNextNode(node);

        }
    }

    public int search(int key) {
        int index = hash(key);
        if (table[index] != null) {
            LinkedListNode head = table[index];
            while (head.getNextNode() != null) {
                if (head.getValue() == key) return head.getValue();
                head = head.getNextNode();
            }
            if (head.getValue() == key) return head.getValue();
        }
        return -1;
    }

    public int delete(int key) {
        int index = hash(key);
        LinkedListNode head = table[index];
        int result = -1;
        if (head.getValue() == key) {
            result = head.getValue();
            if (head.getNextNode() != null) table[index] = head.getNextNode();
            else table[index] = null;
        } else {
            LinkedListNode prev = head;
            while (head.getNextNode() != null) {
                if (head.getValue() == key) {
                    result = head.getValue();
                    prev.setNextNode(head.getNextNode());
                    return result;
                }
                prev = head;
                head = head.getNextNode();
            }
        }
        return result;
    }


    private int hash(int key) {
        int hash = key % table.length;
        return hash;
    }

}
