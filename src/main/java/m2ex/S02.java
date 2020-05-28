package m2ex;

public class S02 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
		public class Speed {
		public void main(String[] args) {
		    float space = 23.67F;
		    float time = 34.90F;
		    float speed = space * time;
		    System.out.println("Il risultato della velocità e': " + speed + "ms^2");
		  }
		}


    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
    	int x = 2;
    	int y = 2;
    	int x2 = 3;
    	int y2 = 3;
    	return Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
    	
    }

    /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
        // TODO
        return 0;
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        // TODO
        return 0;
    }

    /**
     * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
     *
     * @param x
     * @param y
     *
     * @return
     */
    public static int score(double x, double y) {
        // TODO
        return 0;
    }
}
