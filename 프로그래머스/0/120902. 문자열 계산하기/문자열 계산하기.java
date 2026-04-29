class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        
        for (int i = 1; i < arr.length; i += 2) {
            int nextNum = Integer.valueOf(arr[i+1]);
            
            if (arr[i].equals("+")) {
                answer += nextNum;
            } else {
                answer -= nextNum;
            }
        }
        
        int firstNum = Integer.valueOf(arr[0]);
        
        return answer + firstNum;
    }
}