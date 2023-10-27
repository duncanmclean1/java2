public class Calculator implements Calculatable {
    private int x;
    private int y;
    private String history;

    public Calculator() {
        this.history = "";
    }

    @Override
    public Integer add(Integer number1, Integer number2) {
        // TODO Auto-generated method stub
        addHistory(number1 + " + " + number2 + " = " + (number1 + number2));
        return number1 + number2;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        // TODO Auto-generated method stub
        addHistory(number1 + " * " + number2 + " = " + (number1 - number2));
        return number1 - number2;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        // TODO Auto-generated method stub
        addHistory(number1 + " * " + number2 + " = " + number1 * number2);
        return number1 * number2;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        // TODO Auto-generated method stub
        addHistory(number1 + " / " + number2 + " = " + number1 / number2);
        return number1 / number2;
    }

    public void addHistory(String h) {
        this.history += h + ", ";
    }

    public String getHistory() {
        return this.history;
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

    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

}
