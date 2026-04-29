class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int i = 0; i < queries.length; i++) {
            String str = "";
            int s = queries[i][0];
            int e = queries[i][1];
            
            for (int j = 0; j < my_string.length(); j++) {
                if (j == s) {
                    for (int k = e; k >= s; k--) {
                        str += my_string.charAt(k);
                    }
                    j = e;
                    
                } else {
                    str += my_string.charAt(j);
                }
            }
            
            my_string = str;
            answer = str;
        }
        
        return answer;
    }
}