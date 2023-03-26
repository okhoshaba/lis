package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);

        coordX.defineX();
        System.out.println(coordX.getNameX());
        System.out.println(coordX.getStep());

        ClassicUniformGenerator classicUniformGenerator = new ClassicUniformGenerator();

        classicUniformGenerator.setArrayListX(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());

        System.out.println(classicUniformGenerator.toString());
        System.out.println(classicUniformGenerator.getArrayListX());
        context.close();
    }
}
