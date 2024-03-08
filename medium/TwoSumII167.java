package medium;

import java.util.Arrays;

public class TwoSumII167 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,7,9,10},9)));
    }

    public static int[] twoSum(int[] nums, int target){
        int a = 0;
        int b = nums.length-1;
        while(a<=b){
            if(nums[a]+nums[b]>target){
                b--;
            }else if(nums[a]+nums[b]<target){
                a++;
            }else{
                return new int[]{a+1,b+1};
            }
        }
        return new int[]{a+1,b+1};
    }

}
