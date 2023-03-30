package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class PoissonGenerator implements ICoordX {
    ArrayList arrayList = new ArrayList();

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in PoissonGenerator): " + getXArrayList());

//        System.out.println("Downloading Context from PoissonGenerator");

    }

    public ArrayList<Long> getXArrayList() {
        return arrayList;
    }

    public void setXArrayList(int firstOption, int secondOption, int thirdOption) {

    }
}
