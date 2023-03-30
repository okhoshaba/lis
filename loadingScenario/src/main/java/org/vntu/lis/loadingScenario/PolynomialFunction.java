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
                "applicationContext.xml"
        );

        CoordY coordY = context.getBean("coordY", CoordY.class);
//        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        System.out.println("New Coordinate Y (in ClassicGenerator): ");

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

}
