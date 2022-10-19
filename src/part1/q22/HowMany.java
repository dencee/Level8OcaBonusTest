package part1.q22;

public class HowMany {

    public static int count(int a) {
        if (a != 3) {
            int b = 1;
        } else {
            int b = 2;
        }
        return a++ + b;
    }

    public static void main(String[] args) {
        System.out.print(count(3));
        System.out.print(count(9));
    }
}