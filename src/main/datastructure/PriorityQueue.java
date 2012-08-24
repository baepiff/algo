package datastructure;

import common.Swap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/08 12:50 $
 *          Copyright: BJ2
 * @since 12/08/08
 */
public class PriorityQueue {
    List<Node> list = new ArrayList<Node>();

    public void insert(int value) {
        list.add(new Node(value));
        buildMinHeap();
    }

    public int min() {
        return list.get(0).value;
    }

    public int extractMin() {
        int result = list.remove(0).value;
        buildMinHeap();
        return result;
    }

    private void buildMinHeap() {
        for (int i = (list.size() - 1) / 2; i >= 0 ; i--) {
            heapify(i, list.size());
        }
    }

    private void heapify(int idx, int length) {
        int adaptorIdx = (idx + 1) * 2;
        int leftIdx = adaptorIdx - 1;
        int rightIdx = adaptorIdx;
        int smallestIdx;
        if (leftIdx < length &&
                list.get(leftIdx).value < list.get(idx).value) {
            smallestIdx = leftIdx;
        } else {
            smallestIdx = idx;
        }
        if (rightIdx < length &&
                list.get(rightIdx).value < list.get(smallestIdx).value) {
            smallestIdx = rightIdx;
        }

        if (smallestIdx != idx) {
            Swap.swap(idx, smallestIdx, list);
            heapify(smallestIdx, length);
        }
    }
}

