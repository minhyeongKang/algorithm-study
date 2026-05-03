import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int select = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int[] selectMon = new int[set.size()];
        int index = 0;
        
        for (int num : set) {
            selectMon[index++] = num;
        }
        
        if (select < selectMon.length) {
            answer = select;
        } else {
            answer = selectMon.length;
        }
        
        return answer;
    }
}