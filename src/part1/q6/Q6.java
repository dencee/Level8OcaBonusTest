package part1.q6;

public class Q6 {

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        b.append("maybe").insert(2, "sh").insert(5, "xy");
        System.out.println(b.toString());
    }
}
