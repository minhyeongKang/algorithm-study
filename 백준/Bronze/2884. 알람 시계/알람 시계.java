import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int inputHour = sc.nextInt();
        int inputMin = sc.nextInt();
        
        int time = (inputHour * 60) + inputMin;
        time -= 45;
        
        if (time < 0) {
            time += (24 * 60);
        }
        
        int outputHour = (time / 60) % 24;
        int outputMin = time % 60;
        
        System.out.println(outputHour + " " + outputMin);
    }
}