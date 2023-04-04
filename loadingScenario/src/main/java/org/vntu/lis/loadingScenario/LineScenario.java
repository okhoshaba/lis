package org.vntu.lis.loadingScenario;

public class LineScenario {
    private ICoordX classicUniformGenerator;
    public LineScenario() {
        classicUniformGenerator = new ClassicUniformGenerator();
        classicUniformGenerator.downloadContext();

    }


//    classicUniformGenerator.downloadContext();

}
