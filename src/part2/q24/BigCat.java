package part2.q24;

public abstract class BigCat {
    protected final void purr() {
        System.out.println("BigCat purrs!");
    }

    public static void main(String[] args) {
        BigCat bigCat = new Ocelot();
        bigCat.purr();
    }
}

class Ocelot extends BigCat {
    @Override
    protected final void purr() { System.out.println("Ocelot purrs!"); }
}
