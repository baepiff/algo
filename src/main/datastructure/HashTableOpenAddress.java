package datastructure;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/09/05 9:03 $
 *          Copyright: BJ2
 * @since 12/09/05
 */
public class HashTableOpenAddress {

    int[] table = new int[256];

    public void insert(int value) {
        int i = 0;
        int index = doubleHash(value, i);
        while (i < table.length && table[index] != 0) {
            i++;
            index = doubleHash(value, i);
        }
        if (i == table.length) throw new RuntimeException("overflow array");
        table[index] = value;
    }

    public int search(int key) {
        int i = 0;
        int index = doubleHash(key, i);
        while (i < table.length && table[index] != key && table[index] != 0) {
            i++;
            index = doubleHash(key, i);
        }
        if (i == table.length) throw new RuntimeException("overflow array");
        if (table[index] == key) return table[index];
        return -1;
    }

    public int delete(int key) {
        int i = 0;
        int index = doubleHash(key, i);
        while (i < table.length && table[index] != key && table[index] != 0) {
            i++;
            index = doubleHash(key, i);
        }
        if (i == table.length) throw new RuntimeException("overflow array");
        if (table[index] == key) {
            int result = table[index];
            table[index] = -1;
            return result;
        } else {
            return -1;
        }
    }

    private int doubleHash(int key, int i) {
        return (hash1(key) + i * hash2(key)) % table.length;
    }

    private int hash1(int key) {
        int hash = key % table.length;
        return hash;
    }

    private int hash2(int key) {
        int hash = 1 + key % (table.length - 1);
        return hash;
    }

    private int quadraticProbingHash(int key, int i) {
        return (hash1(key) + 1*i + 2*i^2) % table.length;
    }
}
