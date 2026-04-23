import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[26];
        
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        
        String str = sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}