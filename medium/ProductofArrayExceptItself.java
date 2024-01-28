package medium;

import java.util.Arrays;

public class ProductofArrayExceptItself {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
        productExceptSelf(new int[]{2,3,4});
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] in = new int[nums.length];
        int [] out = new int[nums.length];
        for (int i = 0; i < in.length; i++){
            in[i] = 1;
            out[i] = 1;
        }
        for (int i = 1; i < nums.length; i++)
            in[i] = nums[i-1]*in[i-1];
        int res [] = new int[nums.length];
        for (int i = nums.length-2; i >= 0 ; i--){
            out[i] = out[i+1]*nums[i+1];
        }
        for (int i = 0; i < nums.length ; i++){
            res[i] = in[i]*out[i];
        }
        return res;
    }

}
