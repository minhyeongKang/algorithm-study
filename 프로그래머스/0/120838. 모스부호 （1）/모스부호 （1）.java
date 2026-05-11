class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] secret = letter.split(" ");
        
        for (int i = 0; i < secret.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (secret[i].equals(morse[j])) {
                    answer += (char)('a' + j);
                }
            }
        }
        
        return answer;
    }
}