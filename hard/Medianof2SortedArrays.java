package hard;

import java.util.Arrays;

public class Medianof2SortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2})); // Output: 2.0
        System.out.println(findMedianSortedArrays(new int[]{1,3,9},new int[]{2,5,8})); // Output: 4.0
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4})); // Output: 2.5
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = nums1.length-1;
        int right = 0;
        while(left >= 0 && right < nums2.length){
            if(nums1[left] > nums2[right] ){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left --;
                right ++;
            }else{
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int mid = nums1.length + nums2.length;
        if(mid % 2 ==0){
            int first = ((mid/2)-1);
            int second = mid/2;
            int sum = 0;
            if(first<nums1.length)
                sum+=nums1[first];
            if(second<nums2.length)
                sum+=nums2[second-first-1];
            if(first>nums1.length-1)
                sum+=nums1[first];
            if(second>nums2.length-1)
                sum+=nums2[second-first-1];
            return sum/2.0;
        }else{
             return mid/2 < nums1.length ? nums1[mid/2] :nums2[mid/2];
        }
    }

}
