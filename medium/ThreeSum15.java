package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1,-1,-1,0}));
        System.out.println(threeSum(new int[]{-2,-2,0,0,2,2}));
    }
//    [1,-1,-1,0]
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i==0 || i> 0 && nums[i] !=nums[i-1] ){
                int a = i+1;
                int b = nums.length-1;
                while(a < b){
                    int threeSum = nums[i] + nums[a] + nums[b];
                    if(threeSum > 0)
                        b --;
                    else if(threeSum < 0)
                        a++;
                    else{
                        result.add(Arrays.asList(nums[i],nums[a],nums[b]));
                        a++;
                        while(a < b && nums[a]==nums[a-1]) a++;
                    }
                }
            }
        }

        return result;
    }

}
