import java.util.HashMap;
public class map {

    class Coords {
        int x;
        int y;

        public boolean equals(Object o) {
            Coords c = (Coords) o;
            return c.x == x && c.y == y;
        }

        public Coords(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        public int hashCode() {
            return new Integer(x + "0" + y);
        }
    }

    public static void main(String args[]) {

        HashMap<Coords, Character> map = new HashMap<Coords, Character>();
        map.put (new Coords(66, 72), "Dan");
    }

}
