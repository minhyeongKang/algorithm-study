import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        String str = "";
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i++) {
            str += my_str.charAt(i);
            
            if (str.length() == n) {
                list.add(str);
                str = "";
            }
        }
        
        if (!str.equals("")) {
            list.add(str);
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}