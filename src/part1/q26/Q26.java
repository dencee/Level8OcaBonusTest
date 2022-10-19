package part1.q26;

public class Q26 {

    public static void main(String[] args) {
        String year = "Senior";
        
        switch(year) {
            case "Freshman" : default: case "Sophomore" :
            case "Junior" : System.out.print("See you next year"); break;
            case "Senior" : System.out.print("Congratulations");
        }
    }

}
