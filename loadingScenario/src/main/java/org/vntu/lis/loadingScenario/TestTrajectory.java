package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        CoordY coordY = context.getBean("coordY", CoordY.class);
        context.close();


        // For diagnose purposes only  ??? It needs to be in a separate group
        // (For example: Diagnose input parameters).
//        System.out.println(coordX.getStep());
//        System.out.println("coordY, x parameter: " + coordY.getxParametr());
//        System.out.println("coordY, b parameter: " + coordY.getbParametr());

        // Business Logics for ClassicUniformGenerator
        // For diagnose only
        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.downloadContext();

        // Business Logics for DefineUniformGenerator
        // For diagnose only
        ICoordX defineUniformGenerator = new DefineUniformGenerator();
        defineUniformGenerator.downloadContext();
//        defineUniformGenerator.setXArrayList(coordX.getStep(), coordX.getPeriod(), coordX.getSeries());
//        System.out.println("Coordinate X (in UniformGenerator): " + defineUniformGenerator.getXArrayList());

        ICoordX poissonGenerator = new PoissonGenerator();
        poissonGenerator.downloadContext();

    }
}
