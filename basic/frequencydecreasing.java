import java.util.*;

public class frequencydecreasing {
    public static void main(String[] args) {
        String str = "Krishna Prasath";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        for (int f = maxFreq; f > 0; f--) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] == f) {
                    char ch = (char) (i + 'a');
                    System.out.println(ch + "-" + f);
                }
            }
        }
    }
}
