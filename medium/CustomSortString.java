package medium;

public class CustomSortString {

    public static void main(String[] args) {
        System.out.println(customSortString("cba","abcd"));
    }

    private static String customSortString(String order, String str) {
        String answer = "";
        char [] alpha = new char[26];
        for (char s:str.toCharArray()) {
            alpha[s-'a']++;
        }
        for (char o:order.toCharArray()) {
            answer+=(""+o).repeat(alpha[o-'a']);
            alpha[o-'a']=0;
        }
        for (int i = 0; i < 26; i++) {
            answer+=(""+(char)(i+'a')).repeat(alpha[i]);
        }
        return answer;
    }



}
