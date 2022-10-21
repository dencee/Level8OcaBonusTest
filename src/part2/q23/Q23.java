package part2.q23;

public class Q23 {
    public static void main(String[] args) {
        System.out.print("a");

        try {
            System.out.print("b");
            e();
        } finally {
            System.out.print("c");
        }
        System.out.print("d");
    }

    private static void e() {
        // code omitted
    }
}
