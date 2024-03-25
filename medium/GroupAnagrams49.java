package medium;

import java.util.*;

public class GroupAnagrams49 {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (anagramMap.containsKey(sortedWord))
                anagramMap.get(sortedWord).add(word);
            else
                anagramMap.put(sortedWord, new ArrayList<>(){{
                    add(word);
                }});
        }
        return new ArrayList<>(anagramMap.values());
    }

}
