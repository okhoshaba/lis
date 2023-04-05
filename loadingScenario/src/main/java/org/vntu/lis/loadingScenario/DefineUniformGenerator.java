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
        context.close();
        setXYArrayList(coordX.getStep(), coordX.getPeriod(), coordX.getSeries());
    }

    public void setXYArrayList(int step, int period, int series) {
        int number = period/step;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }

    @Override
    public String toString() {
        return "DefineUniformGenerator{" +
                "arrayList=" + arrayList +
                '}';
    }
}
