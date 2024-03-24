package medium;

import java.util.Arrays;

public class ProductOfAnArrayExceptItself238 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));//[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));//[0,0,9,0,0]
    }

    public static int[] productExceptSelf(int[] nums) {
        int in[]=new int[nums.length];
        int out[]=new int[nums.length];
        int result [] =new int[nums.length];
        in[0]=1;
        out[nums.length-1]=nums[nums.length-1];
        for(int i=1;i< nums.length;i++)
            in[i]=in[i-1]*nums[i];
        for(int i=nums.length-2;i>=0;i--)
            out[i]=out[i+1]*nums[i];

        for (int i = 0; i < in.length; i++)
            if (i == 0)
                result[i]=1 * out[i+1];
            else if(i == in.length-1)
                result[i]=in[i-1] * 1;
            else
                result[i]=in[i-1] * out[i+1];
        return result;
    }

}
