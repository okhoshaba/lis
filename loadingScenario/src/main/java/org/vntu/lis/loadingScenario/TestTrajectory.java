package org.vntu.lis.loadingScenario;

public class TestTrajectory {

    public static void main(String[] args) {

        // Business Logics for ClassicUniformGenerator
        ICoordX classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.downloadContext();

        ICoordX poissonGenerator = new PoissonGenerator();
        poissonGenerator.downloadContext();

        ICoordX defineUniformGenerator = new DefineUniformGenerator();
        defineUniformGenerator.downloadContext();

    }
}
