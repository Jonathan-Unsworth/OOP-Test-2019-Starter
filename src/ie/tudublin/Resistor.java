package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet {
    public int value, ones, tens, hundreds;
    private UI ui;

    public Resistor(TableRow row) {
        setUi(ui);
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
    }

    public void render() {
        
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

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }
}