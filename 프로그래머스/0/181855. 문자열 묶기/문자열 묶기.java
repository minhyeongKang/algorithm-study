class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int count = 0;
        int[] countNumber = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            count = strArr[i].length();
            countNumber[count]++;
        }
        
        answer = countNumber[0];
        for (int i = 0; i < countNumber.length; i++) {
            if (countNumber[i] >= answer) {
                answer = countNumber[i];
            }
        }
        return answer;
    }
}