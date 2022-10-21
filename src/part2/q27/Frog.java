package part2.q27;

import java.util.ArrayList;

// java.util.List isn't imported

public class Frog {
    public int Frog() { return 0; }

    // java.util.List isn't imported
    private List<Integer> legs;

    public Frog() {
        legs = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            legs.add(i);
        }
    }
}
