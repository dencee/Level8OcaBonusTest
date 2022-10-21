package part2.q11;

public class PrintCharacters {

    public static void main(String[] args) {
        char value = 'c';

        do
            System.out.print(value++);
        while (value <= 'f');
    }
}
