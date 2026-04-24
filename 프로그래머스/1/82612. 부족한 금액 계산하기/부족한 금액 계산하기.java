class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long priceCount = 0;
        
        for (int i = 1; i <= count; i++) {
            priceCount += (price * i);
        }
        
        if (priceCount <= money) {
            answer = 0;
        } else {
            answer = priceCount - money;
        }

        return answer;
    }
}