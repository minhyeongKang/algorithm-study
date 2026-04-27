import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        Arrays.sort(spell);
        
        for (int i = 0; i < dic.length; i++) {
            String str = dic[i];
            
            if (str.length() != spell.length) {
                continue;
            }
            
            String[] arr = new String[str.length()];
            
            for (int k = 0; k < str.length(); k++) {
                arr[k] = String.valueOf(str.charAt(k));
            }
            
            Arrays.sort(arr);
            
            boolean same = true;
            for (int j = 0; j < arr.length; j++) {
                if (!arr[j].equals(spell[j])) {
                    same = false;
                    break;
                }
            }
            
            if (same) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}