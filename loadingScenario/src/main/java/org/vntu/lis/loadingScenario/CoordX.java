package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordX {

    private ArrayList<Long> arrayListX = new ArrayList<Long>();

    private ICoordX iCoordX;
    private String nameX;
    private Long step = 0L;
    private int number = 0, period = 1000;

    //IoC
    public CoordX(ICoordX iCoordX) {
        this.iCoordX = iCoordX;
    }

    public CoordX() {
    }

    public void setICoordX(ICoordX iCoordX) {
        this.iCoordX = iCoordX;
    }

    public String getNameX() {
        return nameX;
    }

    public void setNameX(String nameX) {
        this.nameX = nameX;
    }

    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriodX(int period) {
        this.period = period;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    void defineX() {
            System.out.println("Coordinates X: " + iCoordX.getX());
        }
}
