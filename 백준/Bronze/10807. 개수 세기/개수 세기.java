import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        int v = sc.nextInt();
        int count = 0;
        
        for (int num : list) {
            if (num == v) count++;
        }
        
        System.out.println(count);
    }
}