import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt() % 42;
        }
        
        Arrays.sort(numbers);
        
        int count = 1;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}