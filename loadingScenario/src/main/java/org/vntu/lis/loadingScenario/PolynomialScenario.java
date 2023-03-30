package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolynomialScenario implements Scenario {
    double bParametr, xParametr, x2Parametr, x3Parametr;

    public static void getContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordY coordY = context.getBean("coordY", CoordY.class);

        context.close();

    }

}
