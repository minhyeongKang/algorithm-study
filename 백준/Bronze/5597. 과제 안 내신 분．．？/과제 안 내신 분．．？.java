import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> student = new ArrayList<>();
        
        for (int i = 0; i < 28; i++) {
            student.add(sc.nextInt());
        }
        
        for (int i = 1; i <= 30; i++) {
            if (!student.contains(i)) {
                System.out.println(i);
            }
        }
    }
}