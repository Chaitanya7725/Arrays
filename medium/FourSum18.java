package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {

    static List<Integer> quad;
    static List<List<Integer>> result  = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        quad = new ArrayList<>();
        Arrays.sort(nums);
        result  = new ArrayList<>();
        kSum(4,0,target,nums);
        return result;
    }

    public static void kSum(int k, int start, int target,int[] nums){
        if(k!=2){
            for (int i = start; i < nums.length-k+1; i++) {
                if(i > start && nums[i]==nums[i-1] ){
                    continue;
                }
                quad.add(nums[i]);
                kSum(k-1,start+1,target-nums[i],nums);
                quad.remove(0);
            }
            return;
        }
        int l=start;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]< target)
                l++;
            else if (nums[l]+nums[r]> target)
                r--;
            else{
                quad.add(nums[l]);
                quad.add(nums[r]);
                result.add(quad);
                l+=1;
                while(l<r && nums[l]== nums[l-1]) l++;
            }
        }
    }


}
