package medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LCS128 {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int []{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int longest = 0;
        for (int i : nums)
            numSet.add(i);

        for (int i:nums) {
            if(!numSet.contains(i-1)){
                int length = 0;
                while(numSet.contains(i+length))
                    length+=1;
                longest=Math.max(longest,length);
            }
        }
        return longest;

    }

}
