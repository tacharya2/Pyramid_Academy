package OOPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFRomArray {
    public static void main(String[] args) {
        int [] arr1 = new int[]{-1, 2, -5, 7, 2, -2, -7, 7};
        int [] arr2 = new int[]{5,6,7,8,5,6,7,5};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
    public static int[] solution(int[]arr){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int []arr3 = new int[set.size()];

        Iterator<Integer> iter = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            arr3[i] = (int)iter.next();
        }
        return arr3;
    }
}
