import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int inputHour = sc.nextInt();
        int inputMin = sc.nextInt();
        int addTime = sc.nextInt();
        
        int totalMin = inputHour * 60 + inputMin + addTime;
        
        int hour = (totalMin / 60) % 24;
        int min = totalMin % 60;
        
        System.out.println(hour + " " + min);
    }
}