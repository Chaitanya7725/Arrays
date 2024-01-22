package easy;
import java.util.*;

public class SetMismatch {

    public static void main(String [] args){
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,1})));
    }

    private static int[] findErrorNums(int[] nums) {
        int [] check = new int[nums.length];
        int [] result = new int[2];
        for(int c:nums)
            check[c-1]++;

        for(int i=0;i<check.length;i++){
            if(check[i]==2)
                result[0]=i+1;
            if(check[i]==0)
                result[1]=i+1;
        }
        return result;
    }

}
