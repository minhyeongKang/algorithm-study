import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int arr[] = new int[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.printf(arr[0] + " " + arr[length - 1]);
    }
}