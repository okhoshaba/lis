package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ClassicUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        context.close();
//        System.out.println("Varibales in ClassicUniformGenerator: " + coordX.getNumber() + " " + coordX.getPeriod() + " " + coordX.getSeries());
        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in ClassicGenerator): " + getXArrayList());

    }


    public void setXArrayList(int number, int period, int series) {
// Add check for right period later...
        long step = (long) period / number;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }


    public ArrayList<Long> getXArrayList() {
        return arrayList;
    }

}
