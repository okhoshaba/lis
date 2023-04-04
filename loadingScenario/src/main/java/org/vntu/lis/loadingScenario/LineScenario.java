package org.vntu.lis.loadingScenario;

public class LineScenario {
    private ICoordX defineUniformGenerator = new DefineUniformGenerator();
    public LineScenario() {
//        classicUniformGenerator = new ClassicUniformGenerator();
        defineUniformGenerator.downloadContext();
    }

    @Override
    public String toString() {
        return "LineScenario{" +
                "classicUniformGenerator=" + defineUniformGenerator.toString() +
                '}';
    }

//    classicUniformGenerator.downloadContext();

}
