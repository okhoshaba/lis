package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordX {

    private ArrayList<Long> arrayListX = new ArrayList<Long>();

    private ICoordX iCoordX;
//    private String nameX;
    private int number, period, series, step;

    //IoC
    public CoordX(ICoordX iCoordX) {
        this.iCoordX = iCoordX;
    }

    public CoordX() {
    }

    public void setICoordX(ICoordX iCoordX) {
        this.iCoordX = iCoordX;
    }

//    public String getNameX() {
//        return nameX;
//    }

//    public void setNameX(String nameX) {
//        this.nameX = nameX;
//    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
