package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

// The ClassicUniformGenerator class uses probabilistic exploration methods.
public class ClassicUniformGenerator implements ICoordX {
    final private ArrayList<Long> xArrayList = new ArrayList<Long>();
    final private ArrayList<Double> yArrayList = new ArrayList<Double>();

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
        // For Diagnostics only:
//        System.out.println("Varibales in ClassicUniformGenerator: " + coordX.getNumber() + " " + coordX.getPeriod() + " " + coordX.getSeries());
        System.out.println("Varibales Y in ClassicUniformGenerator: b = " + coordY.getC0Parametr() + " a = " + coordY.getC1Parametr());
        setXYArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in ClassicGenerator): " + getXArrayList());
        System.out.println("New Coordinate Y (in ClassicGenerator): " + getYArrayList());
    }


    public void setXYArrayList(int number, int period, int series) {

        int min = 1;
        int max = period;
        int range = max - min + 1;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = (int)(rand.nextDouble() * range) + min;
            this.xArrayList.add((long) randNum);
            this.yArrayList.add(1.0);
//            System.out.println(randNum);
        }
        Collections.sort(this.xArrayList);

// Add check for right period later...
//  ??? May be later ???

/*
        long step = (long) period / number;
        long xParameter;
        double yParameter;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++) {
                xParameter = (long) count * step + period * localSeries;
                yParameter = xParameter * coordY.getC1Parametr() + coordY.getC0Parametr();
                this.xArrayList.add(xParameter);
                this.yArrayList.add(yParameter);
            }
*/
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

    public ArrayList<Double> getYArrayList() {
        return yArrayList;
    }

}
