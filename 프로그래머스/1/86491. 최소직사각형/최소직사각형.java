class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWide = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            if (maxWide < w) maxWide = w;
            if (maxHeight < h) maxHeight = h;
        }
        
        answer = maxWide * maxHeight;
        
        return answer;
    }
}