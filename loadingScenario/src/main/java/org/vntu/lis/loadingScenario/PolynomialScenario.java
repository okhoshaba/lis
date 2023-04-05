package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class PolynomialScenario implements ICoordY {

//    CoordX coordX;
    CoordY coordY;

    double bParametr, xParametr, x2Parametr, x3Parametr;
    /**
     * @return
     */
    public ArrayList<Long> getYArrayList() {
        System.out.println("Coordinate Y for PolynomialScenario: " + coordY.getbParametr());
        return null;
    }

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        coordY = context.getBean("coordY", CoordY.class);
        context.close();
        // For Diagnostic purposes only
//        System.out.println("Varibales in PolynomialFunction: " + coordY.getbParametr() + " " + coordY.getxParametr());

    }

}
