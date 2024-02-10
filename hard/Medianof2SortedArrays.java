package hard;

import java.util.Arrays;

public class Medianof2SortedArrays {

    public static void main(String[] args) {
//        findMedianSortedArrays(new int[]{}, new int[] {});
//        findMedianSortedArrays(new int[]{}, new int[] {1,2,3});
//        findMedianSortedArrays(new int[]{1}, new int[] {1,2,3});
//        findMedianSortedArrays(new int[]{1,2,3}, new int[] {1,2,3});
        findMedianSortedArrays(new int[]{3,4,5}, new int[] {1,2,3});
    }

    public static double findMedianSortedArrays(int[] n1, int[] n2) {
        if(n1.length == 0 && n2.length == 0) return 0;
        if(n1.length != 0 && n2.length == 0)
            return n1.length % 2 == 0 ? (double)(n1[n1.length/2]+n1[(n1.length/2)-1])/2 : n1[n1.length]/2-1 ;
        if(n1.length == 0 && n2.length != 0)
            return n2.length % 2 == 0 ? (double)(n2[n2.length/2]+n2[(n2.length/2)-1])/2 : n2[n2.length]/2-1 ;
        int [] m = new int[n1.length + n2.length];
        int i = 0;
        int n1_index = 0;
        int n2_index = 0;
        int length = Integer.max(n1.length, n2.length);
        while(length-- > 0){
            int n1_val = n1_index < n1.length ? n1[n1_index] : -1;
            int n2_val = n2_index < n2.length ? n2[n2_index] : -1;
            if(n1_val <= n2_val){
                if(n1_val > 0){
                    m[i] = n1_val;
                    i++;
                    n1_index++;
                }
                if(n2_val > 0){
                    m[i] = n2_val;
                    i++;
                    n2_index++;
                }
            }else{
                if(n2_val > 0){
                    m[i] = n2_val;
                    i++;
                    n2_index++;
                }
                if(n1_val > 0){
                    m[i] = n1_val;
                    i++;
                    n1_index++;
                }
            }
        }
        System.out.println(Arrays.toString(m));
        return 0;//m.length % 2 == 0 ? (double)(m[m.length/2]+m[(m.length/2)-1])/2 : m[m.length]/2-1 ;
    }

}
