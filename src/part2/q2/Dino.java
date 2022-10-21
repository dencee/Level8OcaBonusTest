package part2.q2;

public class Dino {
    final String species = "Triceratops";
    double weight;

    public Dino(double weight) {
        this.weight = weight;
        species = "Raptor";
    }

    public static void main(String[] args) {
        Dino dino = new Dino(500);
        System.out.println(dino.weight);
    }
}
