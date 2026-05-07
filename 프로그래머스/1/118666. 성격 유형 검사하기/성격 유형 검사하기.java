class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[8];
        
        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];
            
            if (choice < 4) {
                int scoreValue = Math.abs(choice - 4);
                
                if (disagree == 'R') score[0] += scoreValue;
                else if (disagree == 'T') score[1] += scoreValue;
                else if (disagree == 'C') score[2] += scoreValue;
                else if (disagree == 'F') score[3] += scoreValue;
                else if (disagree == 'J') score[4] += scoreValue;
                else if (disagree == 'M') score[5] += scoreValue;
                else if (disagree == 'A') score[6] += scoreValue;
                else if (disagree == 'N') score[7] += scoreValue;
            }
            
            if (choice > 4) {
                int scoreValue = Math.abs(choice - 4);
                
                if (agree == 'R') score[0] += scoreValue;
                else if (agree == 'T') score[1] += scoreValue;
                else if (agree == 'C') score[2] += scoreValue;
                else if (agree == 'F') score[3] += scoreValue;
                else if (agree == 'J') score[4] += scoreValue;
                else if (agree == 'M') score[5] += scoreValue;
                else if (agree == 'A') score[6] += scoreValue;
                else if (agree == 'N') score[7] += scoreValue; 
            }
        }
        
        if (score[0] >= score[1]) answer += "R";
        else answer += "T";
        if (score[2] >= score[3]) answer += "C";
        else answer += "F";
        if (score[4] >= score[5]) answer += "J";
        else answer += "M";
        if (score[6] >= score[7]) answer += "A";
        else answer += "N";
        
        return answer;
    }
}