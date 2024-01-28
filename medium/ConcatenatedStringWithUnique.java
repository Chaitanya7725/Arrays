package medium;

import java.util.*;

public class ConcatenatedStringWithUnique {

    public static void main(String[] args) {
        System.out.println(maxLength(new ArrayList<>(Arrays.asList("un","iq","ue"))));
    }

    public static int maxLength(List<String> arr) {
        List<Integer> uniqueCharStrings = new ArrayList<>();
        for (String s : arr) {
            Set<Character> set = new HashSet<>();
            for (char c:s.toCharArray())
                set.add(c);
            if(set.size() !=s.length())
                continue;
            int val = 0;
            for (char c:s.toCharArray()) {
                val |= 1 << (c - 'a');
            }
            uniqueCharStrings.add(val);
        }
        int [] result ={0};
        repeat(0,0,result,uniqueCharStrings);
        return result[0];
    }

    private static void repeat(int index, int temp, int[] result, List<Integer> uniqueCharStrings) {
        result[0] = Integer.max(result[0],Integer.bitCount(temp));
        for (int i = index; i < uniqueCharStrings.size(); i++) {
            if((temp & uniqueCharStrings.get(i)) == 0)
                repeat(i+1, temp | uniqueCharStrings.get(i),result,uniqueCharStrings);
        }
    }
}
