package sort;

import datastructure.LinkedListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/17 9:36 $
 *          Copyright: CYBER AGENT. Inc
 * @since 12/08/17
 */
public class BucketSort implements Sort {
    private LinkedListNode[] bucketArray = new LinkedListNode[10];
    @Override
    public int[] sort(int[] array) {
        return bucketSort(array);
    }

    private int[] bucketSort(int[] array) {
        for (int value: array) {
            insertToBucket(value);
        }

//        for (LinkedListNode node: bucketArray) {
//            LinkedListNode nextNode = node.getNextNode();
//            while (nextNode != null) {
//                int nextValue = nextNode.getValue();
//                LinkedListNode prev = null;
//                while (node != null && node.getValue() < nextValue) {
//                    prev = node;
//                    node = node.getNextNode();
//                }
//                nextNode.setNextNode(node);
//                if (prev == null) {
//
//                }
//                nextNode = node.getNextNode();
//            }
//        }

        int idx = 0;
        for (LinkedListNode node: bucketArray) {
            while (node != null) {
                array[idx] = node.getValue();
                node = node.getNextNode();
                idx++;
            }
        }

        return array;
    }

    private void insertToBucket(int value) {
        int idx = value / 10;
        LinkedListNode node = new LinkedListNode(value);
        if (bucketArray[idx] != null) {
            LinkedListNode previous = null;
            LinkedListNode current = bucketArray[idx];
            while(current != null && node.getValue() > current.getValue())
            {
                previous = current;
                current = current.getNextNode();
            }
            if(previous==null)
                bucketArray[idx] = node;
            else
                previous.setNextNode(node);
            node.setNextNode(current);
        } else {
            bucketArray[idx] = node;
        }
    }
}
