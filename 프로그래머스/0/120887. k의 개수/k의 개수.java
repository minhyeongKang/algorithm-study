class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strNum = "";
        
        for (int n = i; n <= j; n++) {
            strNum = String.valueOf(n);
            
            for (int m = 0; m < strNum.length(); m++) {
                if (strNum.charAt(m) == (char)k + '0') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}