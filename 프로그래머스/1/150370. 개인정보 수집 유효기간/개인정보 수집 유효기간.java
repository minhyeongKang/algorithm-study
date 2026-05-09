import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        String[] todayArr = today.split("\\.");
        int todayNum =
            Integer.parseInt(todayArr[0]) * 12 * 28 +
            Integer.parseInt(todayArr[1]) * 28 +
            Integer.parseInt(todayArr[2]);
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] termArr = terms[i].split(" ");
            map.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyArr = privacies[i].split(" ");
            String date = privacyArr[0];
            String type = privacyArr[1];
            String[] dateArr = date.split("\\.");
            int privacyNum =
                Integer.parseInt(dateArr[0]) * 12 * 28 +
                Integer.parseInt(dateArr[1]) * 28 +
                Integer.parseInt(dateArr[2]);
            
            privacyNum += map.get(type) * 28;
            
            if (privacyNum <= todayNum) {
                list.add(i+1);
            }
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}