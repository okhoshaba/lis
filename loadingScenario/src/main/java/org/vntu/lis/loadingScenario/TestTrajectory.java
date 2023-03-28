package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);

        // For diagnose purposes only  ??? It needs to be in a separate group
        // (For example: Diagnose input parameters).
        coordX.defineX();
        System.out.println(coordX.getNameX());
        System.out.println(coordX.getStep());

        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        System.out.println(classicUniformGenerator.toString());
        System.out.println(classicUniformGenerator.getXArrayList());

        ICoordX defineUniformGenerator = new DefineUniformGenerator();
        defineUniformGenerator.setXArrayList(coordX.getStep(), coordX.getPeriod(), coordX.getSeries());
        System.out.println(defineUniformGenerator.toString());
        System.out.println(defineUniformGenerator.getXArrayList());

        context.close();
    }
}
