package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordY {
    private ArrayList<Long> arrayList = new ArrayList<Long>();

    private ICoordY iCoordY;
    private String nameY;
    private double parametrA, parametrB;

    public ICoordY getiCoordY() {
        return iCoordY;
    }

    public void setiCoordY(ICoordY iCoordY) {
        this.iCoordY = iCoordY;
    }

    public String getNameY() {
        return nameY;
    }

    public void setNameY(String nameY) {
        this.nameY = nameY;
    }

    public double getParametrA() {
        return parametrA;
    }

    public void setParametrA(double parametrA) {
        this.parametrA = parametrA;
    }

    public double getParametrB() {
        return parametrB;
    }

    public void setParametrB(double parametrB) {
        this.parametrB = parametrB;
    }
}
