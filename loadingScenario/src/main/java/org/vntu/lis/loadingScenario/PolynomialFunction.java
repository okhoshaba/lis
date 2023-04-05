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
        context.close();
        // For Diagnostic purposes only
//        System.out.println("Varibales in PolynomialFunction: " + coordY.getbParametr() + " " + coordY.getxParametr());
//        System.out.println("Coordinate Y for PolynomialFunction: " + coordY.getc0Parametr());

    }

}
