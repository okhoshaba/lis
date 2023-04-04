package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {
    public static void main(String[] args) {

        // Business Logics for ClassicUniformGenerator
        // For diagnose only
        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.downloadContext();


//        LineScenario lineScenario = new LineScenario();
//        System.out.println(lineScenario.toString());
//        lineScenario.calculateScenario();

        ICoordX poissonGenerator = new PoissonGenerator();
        poissonGenerator.downloadContext();

        ICoordY polynomialFunction = new PolynomialFunction();
        polynomialFunction.downloadContext();
    }
}
