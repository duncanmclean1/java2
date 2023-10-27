public class AwesomeNumber {
    private int x;

    public AwesomeNumber(int newX) {
        this.x = newX;

    }

    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.getX() + n2.getX();
    }

    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.getX() - n2.getX();
    }

    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

}
