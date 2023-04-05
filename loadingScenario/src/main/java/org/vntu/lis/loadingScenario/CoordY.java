package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordY {
    private ArrayList<Long> arrayList = new ArrayList<Long>();

    private ICoordY iCoordY;
    private double c1Parametr, c0Parametr;

    public ICoordY getiCoordY() {
        return iCoordY;
    }

    public void setiCoordY(ICoordY iCoordY) {
        this.iCoordY = iCoordY;
    }

    public void setC1Parametr(double c1Parametr) {
        this.c1Parametr = c1Parametr;
    }

    public double getC1Parametr() {
        return c1Parametr;
    }
    public double getC0Parametr() {
        return c0Parametr;
    }

    public void setC0Parametr(double c0Parametr) {
        this.c0Parametr = c0Parametr;
    }

    // !!! Change for another Class !!!
    public void setICoordY(PolynomialFunction iCoordY) {
    }
}
