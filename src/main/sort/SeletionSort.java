package sort;

/**
 * @author BJ2(Joongjin Bae)
 * @version $Rev: $Rev$ By $Author: BJ2 A.K.A. bae_joongjin $
 *          $Date: 12/08/01 10:00 $
 *          Copyright: BJ2
 * @since 12/08/01
 */
public class SeletionSort {
    public static void main(String[] args) {
        int[] array = {6,5,3,2,8,7,1};
        array = seletionSort(array);
        for(int entity: array) {
            System.out.println(entity);
        }
    }

    static private int[] seletionSort(int[] array) {
        for (int currentIdx = 0; currentIdx < array.length; currentIdx++) {
            int minIdx = currentIdx;
            for (int findIdx = currentIdx + 1; findIdx < array.length; findIdx++) {
            if (array[findIdx] < array[minIdx]) minIdx = findIdx;
            }
            int temp = array[minIdx];
            array[minIdx] = array[currentIdx];
            array[currentIdx] = temp;
        }
        return array;
    }
}
