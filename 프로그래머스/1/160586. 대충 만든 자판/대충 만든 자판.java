class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);
                int min = Integer.MAX_VALUE;
                
                for (int k = 0; k < keymap.length; k++) {
                    int index = keymap[k].indexOf(ch);
                    
                    if (index != -1) {
                        min = Math.min(min, index + 1);
                    }
                }
                
                if (min == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                
                sum += min;
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}