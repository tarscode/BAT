package Sequence;

import java.util.LinkedList;

/**
 * Created by liuyang on 16/6/11.
 * 基数排序
 */
public class RadixSort {
    public int[] radixSort(int[] A, int n) {
        int m = 1;
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(i, Integer.valueOf(A[i]));
        while (m <= 4) {
            for (int j = 0,len=n; j < 10; j++){
                for (int i = 0; i < len&&i>=0&&len>=0; i++) {
                    if (num((list.get(i)).intValue(), m) == j) {
                        list.addLast(list.get(i));
                        list.remove(i);
                        len--;
                        i--;
                        //System.out.println("m:"+m+" "+"j:"+j+" "+"i:"+list.get(i)+" "+"num:"+num((list.get(i)).intValue(), m));
                        for (int k=0;k<n;k++){
                            System.out.print(list.get(k));
                        }
                        System.out.println();
                    }
                }
            }
            m++;
        }
        for (int i = 0; i < n; i++) {
            A[i] = (list.get(i)).intValue();
        }
        return A;
    }

    private int num(int number, int bit) {
        int bit4 = number / 1000;
        int bit3 = (number - bit4 * 1000) / 100;
        int bit2 = (number - bit4 * 1000 - bit3 * 100) / 10;
        int bit1 = number - bit4 * 1000 - bit3 * 100 - bit2 * 10;
        switch ( bit ) {
            case 1:
                return bit1;
            case 2:
                return bit2;
            case 3:
                return bit3;
            case 4:
                return bit4;
        }
        return bit;
    }
}
