import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int checkNum = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }
        
        int arr[] = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            if (checkNum > arr[i]) {
                System.out.printf(arr[i] + " ");
            }
        }
    }
}