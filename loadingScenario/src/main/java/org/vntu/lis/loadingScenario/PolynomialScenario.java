package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolynomialScenario implements Scenario {
    double bParametr, xParametr, x2Parametr, x3Parametr;

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

    public static void getContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        CoordY coordY = context.getBean("coordY", CoordY.class);
        System.out.println(" Hello from PolynomialScenario class! ");

        context.close();

    }

}
