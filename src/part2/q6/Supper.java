package part2.q6;

import java.io.IOException;

public class Supper {

    public static void eat() throws IOException {
        try {
            System.out.print("1");
            throw new IOException();
        } catch (IOException e) {
            System.out.println("2");
            throw e;
        } finally {
            System.out.println("3");
        }
    }

    public static void main(String[] args) {
        eat();
        System.out.println("4");
    }
}