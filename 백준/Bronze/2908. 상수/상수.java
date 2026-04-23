import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String strA = "";
        String strB = "";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            strA += a.charAt(i);
        }
        
        for (int i = b.length() - 1; i >= 0; i--) {
            strB += b.charAt(i);
        }
        
        int numA = Integer.parseInt(strA);
        int numB = Integer.parseInt(strB);
        
        int max = Math.max(numA, numB);
        
        System.out.print(max);
    }
}