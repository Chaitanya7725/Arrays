package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int []{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int []{3,2,4},6)));
        System.out.println(Arrays.toString(twoSum(new int []{3,3},6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] output = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i],i);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i])!=i){
                output[0]=map.get(target - nums[i]);
                output[1]=i;
            }
        }
        return output;
    }

}
