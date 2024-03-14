package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(fourSum(nums, 8));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result  = new ArrayList<>();
        if(nums.length< 4) return result;
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        int finalI = i;
                        int finalJ = j;
                        int finalK = k;
                        int finalL = l;
                        result.add(new ArrayList<>(){{
                            add(nums[finalI]);
                            add(nums[finalJ]);
                            add(nums[finalK]);
                            add(nums[finalL]);
                        }});
                        while(nums[k]==nums[k+1]) k++;
                        while(nums[l]==nums[l-1]) l--;
                        k++;
                        l--;
                    } else if(sum < target){
                        k++;
                    } else {
                        l--;
                    }
                    while(nums[j]==nums[j+1]) j++;
                }
                while(nums[i]==nums[i+1]) i++;
            }
        }
        return result;
    }

}
