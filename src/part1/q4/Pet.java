package part1.q4;

public class Pet {
    public void eat() throws NullPointerException {
        throw new NullPointerException();
    }
    
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.eat();
        System.out.println("Pet just ate");
    }
}
