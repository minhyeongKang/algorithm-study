class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            if (arr[1].equals("+")) {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[2]);
                int result = Integer.parseInt(arr[4]);
                
                int sum = num1 + num2;
                
                if (sum == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[2]);
                int result = Integer.parseInt(arr[4]);
                
                int sum = num1 - num2;
                
                if (sum == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}