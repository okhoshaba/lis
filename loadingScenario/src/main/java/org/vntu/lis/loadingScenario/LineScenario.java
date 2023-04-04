package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class LineScenario {
    private ICoordX defineUniformGenerator = new DefineUniformGenerator();

    private ArrayList<Long> arrayListY = new ArrayList<Long>();

    public LineScenario() {
        // Download all coordinate parameters from configuration file (coordinatesContext.xml)
        defineUniformGenerator.downloadContext();
    }

    private ArrayList<Long> arrayListX = defineUniformGenerator.getXArrayList();

    public void calculateScenario() {
        System.out.println("ArrayListX: " + arrayListX);
        arrayListY.add()

    }
}
