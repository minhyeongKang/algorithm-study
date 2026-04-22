import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int basket[] = new int[n];
        
        for (int l = 0; l < n; l++) {
            basket[l] = l + 1;
        }
        
        for (int l = 0; l < m; l++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            
            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                
                i++;
                j--;
            }
        }
        
        for (int l = 0; l < n; l++) {
            System.out.print(basket[l] + " ");
        }
    }
}