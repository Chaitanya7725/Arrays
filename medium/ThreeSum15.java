package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1,-1,-1,0}));
    }
//    [1,-1,-1,0]
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i==0 || i> 0 && nums[i] !=nums[i-1] ){
                int a = i+1;
                int b = nums.length-1;
                int sum = 0 - nums[i];
                while(a < b){
                    if(nums[a] + nums[b] == sum ){
                        result.add(Arrays.asList(nums[i],nums[a],nums[b]));
                        while(a < b && nums[a]==nums[a+1]) a++;
                        while(a < b && nums[b]==nums[b-1]) b--;
                        a++;
                        b--;
                    }   else if(nums[a]+ nums[b] > sum){
                        b--;
                    } else{
                        a++;
                    }
                }
            }
        }

        return result;
    }

}
