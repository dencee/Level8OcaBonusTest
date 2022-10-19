package part1.q28;

public class Q28 {

    public static void main(String[] args) {
        int a = 123;
        int b = 0;

        try {
            System.out.print(a / b);
            System.out.print("1");
        } catch (RuntimeException e) {
            System.out.print("2");
        } catch (ArithmeticException e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
    }
}
