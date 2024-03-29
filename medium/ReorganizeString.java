package medium;

import java.util.*;

public class ReorganizeString {

    public static void main(String [] args){
        System.out.println(reorganizeString("aab"));
        System.out.println(reorganizeString("bba"));
    }

    private static String reorganizeString(String s) {
        StringBuilder result= new StringBuilder();
        Map<Character, Integer> counts= new HashMap<>();

        for(char c:s.toCharArray())
            counts.put(c,counts.getOrDefault(c,0)+1);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->counts.get(b)-counts.get(a));
        maxHeap.addAll(counts.keySet());
        while(maxHeap.size() > 1){
            char current = maxHeap.remove();
            char next = maxHeap.remove();
            result.append(current);
            result.append(next);
            counts.put(current,counts.get(current)-1);
            counts.put(next,counts.get(next)-1);
            if(counts.get(current) > 0)
                maxHeap.add(current);
            if(counts.get(next) > 0)
                maxHeap.add(next);
        }
        if(!maxHeap.isEmpty()){
            char last = maxHeap.remove();
            if(counts.get(last) > 1)
                return "";
            result.append(last);
        }
        return result.toString();
    }

}
