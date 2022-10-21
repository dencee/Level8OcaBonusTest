package part2.q22;

public class ExceptionLogger {

    public static void logException(RuntimeException e) {
        System.out.println("Logging " + e);
    }

    public static void main(String[] args) {
        // logException(new __________________);
        //logException(new Error()                     );
        //logException(new Exception()                 );
        //logException(new java.io.IOException()       );
        logException(new NullPointerException()      );
        logException(new RuntimeException()          );
    }
}
