package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrajectory {

        public static void main(String[] args) {

        // Business Logics for ClassicUniformGenerator
        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.downloadContext();

        ICoordX defineUniformGenerator = new DefineUniformGenerator();
        defineUniformGenerator.downloadContext();


//        LineScenario lineScenario = new LineScenario();
//        System.out.println(lineScenario.toString());
//        lineScenario.calculateScenario();

        ICoordX poissonGenerator = new PoissonGenerator();
        poissonGenerator.downloadContext();

//        ICoordY polynomialScenario = new PolynomialScenario();
//        polynomialScenario.downloadContext();
// In the future... do private... export to csv or xml ...
//        polynomialScenario.getYArrayList();

//        ICoordY polynomialFunction = new PolynomialFunction();
//        polynomialFunction.downloadContext();
    }
}
