class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int x = 0;
        int lastNum = common.length - 1;
        
        if (common[1] - common[0] == common[2] - common[1]) {
            x = common[1] - common[0];
            answer = common[lastNum] + x;
        } else {
            x = common[1] / common[0];
            answer = common[lastNum] * x;
        }
        
        return answer;
    }
}