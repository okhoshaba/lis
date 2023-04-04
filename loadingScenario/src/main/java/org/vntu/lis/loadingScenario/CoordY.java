package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordY {
    private ArrayList<Long> arrayList = new ArrayList<Long>();

    private ICoordY iCoordY;
    private double xParametr, aParametr, bParametr;

    public ICoordY getiCoordY() {
        return iCoordY;
    }

    public void setiCoordY(ICoordY iCoordY) {
        this.iCoordY = iCoordY;
    }

    public double getaParametr() {
        return aParametr;
    }

    public void setaParametr(double aParametr) {
        this.aParametr = aParametr;
    }

    public double getxParametr() {
        return xParametr;
    }

    public void setxParametr(double xParametr) {
        this.xParametr = xParametr;
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
