import java.util.ArrayList;

public class Magic2 {
    public static void main(String[] args) {
        System.out.println("========== Lambdas ==========");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(35);
        numbers.add(48);
        //numbers.add(49);
        numbers.add(18);
        numbers.add(13);
        numbers.forEach((x) -> {
            if (x == 49) {
                System.out.println("Found 49");
            }
        });

    }
}