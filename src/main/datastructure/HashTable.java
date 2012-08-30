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
    int[] table = new int[256];

    public void insert(int value) {
        int index = hash(value);
        table[index] = value;
    }

    public int search(int key) {
        int index = hash(key);
        if (table[index] != 0) return table[index];
        return -1;
    }

    public int delete(int key) {
        int index = hash(key);
        int result = table[index];
        table[index] = 0;
        return result;
    }


    private int hash(int key) {
        int hash = key % table.length;
        return hash;
    }

}
