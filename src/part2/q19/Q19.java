package part2.q19;

import java.util.ArrayList;
import java.util.List;

public class Q19 {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();

        numbers.add("4");
        numbers.add("7");
        numbers.set(1, "5");
        numbers.add("8");
        numbers.remove(0);
        
        for (String number : numbers) System.out.print(number);
    }

}
