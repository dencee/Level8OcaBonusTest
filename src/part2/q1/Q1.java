package part2.q1;

import java.util.Date;

public class Q1 {

    public static void main(String[] args) {
        Date a = new Date();
        Date b = new Date();
        Date c = a;
        
        System.out.println(c.toString());

        a = null;
        c = null;
    }
}
