// 2.2 There is point given with x and y coordinates (for example x=5, y=-10).
// Program should print in which quarter this point is located

import java.util.HashMap;

public class Map{
	
	public static void main (String [] args) {

		HashMap <Coords, Character> map = new HashMap<Coords, Character>();
		map.put (new Coords(5, -7), "Dan");
	}
	
//	public void move(int x, int y) {
//	    this.x = x;
//	    this.y = y;
	}
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
			
		}
}
