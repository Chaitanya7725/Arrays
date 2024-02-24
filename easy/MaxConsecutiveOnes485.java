package easy;

public class MaxConsecutiveOnes485 {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1}));//2
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));//3
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));//2
        System.out.println(findMaxConsecutiveOnes(new int[]{1}));//1
        System.out.println(findMaxConsecutiveOnes(new int[]{0}));//0
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int current = 0, max =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                current++;
                if(current > max)
                    max = current;
            }else{
                current=0;
            }
        }
        return max;
    }

}
