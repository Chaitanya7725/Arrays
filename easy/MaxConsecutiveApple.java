package easy;

import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveApple {

    public static void main(String[] args) {
        System.out.println(calls(new String[]{"1","2","3chai","2","2","2","1","1","1"}));
        System.out.println(calls(new String[]{"1","1","0","0","0","1"})); //2
        System.out.println(calls(new String[]{"0","1","1"})); //1
    }

    private static int calls(String[] strings) {
        List<Integer> archive = new ArrayList<>();
        for (String s : strings) {
            try {
                archive.add(Integer.valueOf(s));
            }catch (Exception e){}
        }
        int current = 0, previous = archive.get(0), counter = 1,max = 0;
        if (archive.size() == 1) return 1;
        for (int i = 1; i < archive.size(); i++) {
            current = archive.get(i);
            counter = previous != current ? 1: counter+1;
            if(counter > max)
                max = counter;
            previous = current;
        }
        return max;
    }


}
