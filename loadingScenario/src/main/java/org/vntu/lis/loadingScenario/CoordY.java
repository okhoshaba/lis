package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordY {
    private ArrayList<Long> arrayList = new ArrayList<Long>();

    private ICoordY iCoordY;
    private double aParametr, bParametr;

    public ICoordY getiCoordY() {
        return iCoordY;
    }

    public void setiCoordY(ICoordY iCoordY) {
        this.iCoordY = iCoordY;
    }

    public void setaParametr(double aParametr) {
        this.aParametr = aParametr;
    }

    public double getaParametr() {
        return aParametr;
    }
    public double getbParametr() {
        return bParametr;
    }

    public void setbParametr(double bParametr) {
        this.bParametr = bParametr;
    }

    // !!! Change for another Class !!!
    public void setICoordY(PolynomialFunction iCoordY) {
    }
}
