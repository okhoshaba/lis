package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class PolynomialFunction implements ICoordY {
    double bParametr, xParametr, x2Parametr, x3Parametr;
    /**
     * @return 
     */
    public ArrayList<Long> getYArrayList() {
        return null;
    }

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        CoordY coordY = context.getBean("coordY", CoordY.class);
        // For Diagnostic purposes only
        System.out.println("Coordinate Y for PolynomialFunction: " + getbParametr());

    }

    public double getbParametr() {
        return bParametr;
    }

    public double getxParametr() {
        return xParametr;
    }

    public double getX2Parametr() {
        return x2Parametr;
    }

    public double getX3Parametr() {
        return x3Parametr;
    }

    public void setbParametr(double bParametr) {
        this.bParametr = bParametr;
    }

    public void setxParametr(double xParametr) {
        this.xParametr = xParametr;
    }

    public void setX2Parametr(double x2Parametr) {
        this.x2Parametr = x2Parametr;
    }

    public void setX3Parametr(double x3Parametr) {
        this.x3Parametr = x3Parametr;
    }
}
