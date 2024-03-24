package medium;

import java.util.Arrays;

public class ProductOfAnArrayExceptItself238 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));//[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));//[0,0,9,0,0]
    }

    public static int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix =1;
        int result [] = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = result.length-1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

}
