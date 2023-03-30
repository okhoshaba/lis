package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class DefineUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();


    public ArrayList<Long> getXArrayList() {
        return arrayList;
    }

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in DefineUniformGenerator): " + getXArrayList());
    }

    public void setXArrayList(int step, int period, int series) {
        int number = period/step;

        int localSeries = -1;

        // Check it!
        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }

}
