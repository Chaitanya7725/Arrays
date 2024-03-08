package medium;

import java.util.Arrays;

public class ThreeSumClosest16 {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int current_sum = nums[i] + nums[low] + nums[high];
                if(current_sum > target){
                    high--;
                } else{
                    low++;
                }
                if(Math.abs(closest-target) > Math.abs(current_sum-target))
                    closest = current_sum;
            }
        }
        return closest;
    }

}
