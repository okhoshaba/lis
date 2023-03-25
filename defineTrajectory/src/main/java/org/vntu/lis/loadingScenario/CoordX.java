package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordX {

    private ArrayList<float> listICoordX = new ArrayList<float>();

    private ICoordX iCoordX;
    private String nameX;
    private Float stepX, lengthX;

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

    public Float getStepX() {
        return stepX;
    }

    public void setStepX(Float stepX) {
        this.stepX = stepX;
    }

    public Float getLengthX() {
        return lengthX;
    }

    public void setLengthX(Float lengthX) {
        this.lengthX = lengthX;
    }

    void defineX() {
        System.out.println("Coordinates X: " + iCoordX.getX());
    }
}
