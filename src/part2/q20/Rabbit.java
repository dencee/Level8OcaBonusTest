package part2.q20;

interface HasHindLegs {
    int getLegLength();
}

interface CanHop extends HasHindLegs {
    public void hop();
}

public class Rabbit implements CanHop {
    @Override
    int getLegLength() {
        return 5;
    }

    @Override
    public void hop() {
        System.out.println("Hop");
    }

    public static void main(String[] args) {
        new Rabbit().hop();
    }
}
