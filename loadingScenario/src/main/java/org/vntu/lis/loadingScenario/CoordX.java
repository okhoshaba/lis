package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class CoordX {

    private ArrayList<Long> listX = new ArrayList<Long>();

    private ICoordX iCoordX;
    private String nameX;
    private Long stepX = 0L, lengthX=0L;
    private int numbers = 0;

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

    public Long getStepX() {
        return stepX;
    }

    public void setStepX(Long stepX) {
        this.stepX = stepX;
    }

    public Long getLengthX() {
        return lengthX;
    }

    public void setLengthX(Long lengthX) {
        this.lengthX = lengthX;
    }

    void defineX() {
        System.out.println("Coordinates X: " + iCoordX.getX());
    }
}
