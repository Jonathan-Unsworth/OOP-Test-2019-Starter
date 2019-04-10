package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;

public class Colour {
    public int r, g, b;
    private String colour;
    private int value;

    public Colour(TableRow row) {
        setColour(row.getString(colour));
        setR(row.getInt(r));
        setG(row.getInt(g));
        setB(row.getInt(b));
        setValue(row.getInt(value));
    }

    public String toString() {
        return Integer.toString(r) + " " + Integer.toString(g) + " " + Integer.toString(b);
    }




    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}