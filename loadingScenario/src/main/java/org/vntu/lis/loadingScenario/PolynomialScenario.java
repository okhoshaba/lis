package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PolynomialScenario implements Scenario {

    public static void getContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        CoordY coordY = context.getBean("coordY", CoordY.class);

        context.close();

    }

}
