package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0;i<nums.length-1;i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int a=nums[i];
                    int b=nums[j];
                    int c=nums[k];
                    if((a+b+c)==0 && !result.contains(new ArrayList<>(){{
                        add(a);
                        add(b);
                        add(c);
                    }}))
                        result.add(new ArrayList<>(){{
                            add(a);
                            add(b);
                            add(c);
                        }});
                }
            }
        }
        return result;
    }

}
