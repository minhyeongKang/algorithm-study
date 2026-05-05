class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int totalRemoved = 0;
        int count = 0;
        
        while (!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replace("0", "");
            
            int afterLength = s.length();
            totalRemoved += (beforeLength - afterLength);
            
            s = Integer.toBinaryString(afterLength);
            
            count++;
            
        }
        
        answer[0] = count;
        answer[1] = totalRemoved;
        
        return answer;
    }
}