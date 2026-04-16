import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        for (int i = 0; i < m; i++) {
            
            int firstIndex = sc.nextInt() - 1;
            int secondIndex = sc.nextInt() - 1;
            
            int tmp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = tmp;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}