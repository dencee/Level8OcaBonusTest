package part1.q19;

public class Q19 {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 4, 6};
        Object p = nums;
        String[] two = (String[]) p;
        System.out.println(two[two.length]);
    }
}
