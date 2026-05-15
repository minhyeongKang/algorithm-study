import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String str = "";
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            
            if (ch != 'a' && ch != 'b' && ch != 'c') {
                str += ch;
            } else {
                if (!str.equals("")) {
                    list.add(str);
                }
                
                str = "";
            }
        }
        
        if (!str.equals("")) {
            list.add(str);
        }
        
        if (list.size() == 0) {
            return new String[]{"EMPTY"};
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}