import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            char startCh = str.charAt(0);
            char lastCh = str.charAt(str.length() - 1);
            System.out.printf("%c%c\n", startCh, lastCh);
        }
    }
}