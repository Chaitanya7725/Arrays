package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
        System.out.println(fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        int size = nums.length;
        if(size < 4 || nums==null) return output;
        Arrays.sort(nums);
        for(int i=0;i<size -3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<size -2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left = j+1;int right = size -1;
                while(left<right){
                    int sum = nums[i] + nums[j] + nums[left]+ nums[right];
                    if(sum == target){
                        List<Integer> current = new ArrayList<>();
                        current.add(nums[i]);current.add(nums[j]);current.add(nums[left]);current.add(nums[right]);
                        output.add(current);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left+1]) {
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                    }else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return output;
    }


}
