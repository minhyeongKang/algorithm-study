class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftThumb = 10;
        int rightThumb = 12;
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (num == 1 || num == 4 || num == 7) {
                leftThumb = num;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                rightThumb = num;
                answer += "R";
            } else if (num == 2 || num == 5 || num == 8 || num == 0) {
                if (num == 0) {
                    num = 11;
                }
                
                int leftDis = Math.abs(leftThumb-num) / 3 + Math.abs(leftThumb-num) % 3;
                int rightDis = Math.abs(rightThumb-num) / 3 + Math.abs(rightThumb-num) % 3;
                
                if (leftDis < rightDis) {
                    leftThumb = num;
                    answer += "L";
                } else if (leftDis > rightDis) {
                    rightThumb = num;
                    answer += "R";
                } else {
                    
                    if (hand.equals("left")) {
                        leftThumb = num;
                        answer += "L";
                    } else {
                        rightThumb = num;
                        answer += "R";
                    }
                }
            }
        }
        
        return answer;
    }
}