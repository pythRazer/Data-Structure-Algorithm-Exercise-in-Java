/*
 * July 2 2019
 * Exercise31
 * by Lee Jui Chi
 */

import java.util.HashMap;

import static java.lang.Float.min;

public class Exercise31 {
    String str1 = "dabdabcabcba";
    String str2 = "abcb";

    public static void main(String[] args) {
        new Exercise31();
    }

    public Exercise31() {
        String[] text = str1.split("");
        String[] pattern = str2.split("");
        printList("text", text);
        printList("pattern", pattern);
        int result = find_boyer_moore(text, pattern);
        System.out.println(result);
    }

    public int find_boyer_moore(String[] text, String[] pattern) {
        int n = text.length;
        int m = pattern.length;
        int j;
        HashMap<String, Integer> last = new HashMap<String, Integer>();
        if(m == 0){
            return 0;
        }


        for(int k = 0; k < m; k++){
            last.put(pattern[k], k);

        }
        int i = m - 1;
        int k = m - 1;
        while(i < n){
            System.out.println("k is " + k + ", text is " + text[i] + ", pattern is " + pattern[k]);
            if(text[i].equals(pattern[k])){
                if(k == 0){
                    return i;
                }else{
                    i -= 1;
                    k -= 1;
                }
            }else{
                if (last.get(text[i]) == null) {

                    j = -1;

                } else{
                    j = last.get(text[i]);
                }
                i += m - min(k, j+1);
                k = m - 1;


            }
        }
        return -1;
    }

    public void printList(String str, String[] list) {
        System.out.print(str + ": ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}