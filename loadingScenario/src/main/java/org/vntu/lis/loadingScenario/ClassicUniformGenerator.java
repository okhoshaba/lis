package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ClassicUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordX coordX = context.getBean("coordX", CoordX.class);
        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        System.out.println("New Coordinate X (in ClassicGenerator): " + getXArrayList());

        //        System.out.println("Downloading Context from ClassicUniformGenerator:  " + coordX.getPeriod());
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
