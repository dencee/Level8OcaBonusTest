package part1.q3;

public class Q3 {
public static void main(String[] args) {
    String s = "Hello";
    String t = new String(s);
    if ("Hello".equal(s)) System.out.println("one");
    if (t == s) System.out.println("two");
    if (t.equal(s)) System.out.println("three");
    if ("Hello" == s) System.out.println("four");
    if ("Hello" == t) System.out.println("five");
}
