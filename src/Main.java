import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }
        numbers.forEach((number) -> {
            System.out.println(number);
        });
    }
}