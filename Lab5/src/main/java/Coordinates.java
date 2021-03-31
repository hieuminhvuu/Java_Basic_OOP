/**
 * X-Y coordinates.
 */

public class Coordinates {
    private int x;
    private Long y;

    /**
     * Set data for coordinates
     * @param x
     * @param y
     */
    public Coordinates(int x, long y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return X-coodinate.
     */
    public int getX(){
        return x;
    }

    /**
     * @return Y-coodinate.
     */
    public long getY(){
        return y;
    }

    /**
     * Valua of X, Y (coordinates)
     * @return
     */
    @Override
    public String toString(){
        return "X:" + x + " -" + " Y:" + y;
    }
}
