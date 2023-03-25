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

        UniformGenerator uniformGenerator = new UniformGenerator();

        uniformGenerator.setArrayListX(coordX.getStep(), coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        System.out.println(uniformGenerator.toString());
        System.out.println(uniformGenerator.getArrayListX());
        context.close();
    }
}
