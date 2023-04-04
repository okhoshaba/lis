package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {
    public static void main(String[] args) {

        // Business Logics for ClassicUniformGenerator
        // For diagnose only
//        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
//        classicUniformGenerator.downloadContext();
        LineScenario lineScenario = new LineScenario();

        // Business Logics for DefineUniformGenerator
        // For diagnose only
        ICoordX defineUniformGenerator = new DefineUniformGenerator();
        defineUniformGenerator.downloadContext();

        ICoordX poissonGenerator = new PoissonGenerator();
        poissonGenerator.downloadContext();

        ICoordY polynomialFunction = new PolynomialFunction();
        polynomialFunction.downloadContext();
    }
}
