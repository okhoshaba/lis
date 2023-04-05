package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ClassicUniformGenerator implements ICoordX {
    final private ArrayList<Long> xArrayList = new ArrayList<Long>();
    final private ArrayList<Long> yArrayList = new ArrayList<Long>();

    private CoordX coordX;
    private  CoordY coordY;

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        this.coordX = context.getBean("coordX", CoordX.class);
        this.coordY = context.getBean("coordY", CoordY.class);

        context.close();
//        System.out.println("Varibales in ClassicUniformGenerator: " + coordX.getNumber() + " " + coordX.getPeriod() + " " + coordX.getSeries());
        System.out.println("Varibales Y in ClassicUniformGenerator: b = " + coordY.getbParametr() + "  x = " + coordY.getxParametr() + " a = " + coordY.getaParametr());
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
                this.xArrayList.add((long) count * step + period * localSeries);
    }

    @Override
    public String toString() {
        return "ClassicUniformGenerator{" +
                "arrayList=" + xArrayList +
                '}';
    }

    public ArrayList<Long> getXArrayList() {
        return xArrayList;
    }

}
