package part2.q30;

import java.util.function.Predicate;

public class Q30 {

    public static void main(String[] args) {
//        check(() -> s.isEmpty());
        check(s -> s.isEmpty());
//        check(String s -> s.isEmpty());
        check((String s) -> s.isEmpty());
//        check((s1) -> s.isEmpty());
//        check((s1, s2) -> s1.isEmpty());
    }

    public static void check(Predicate<String> predicate) { }
}
