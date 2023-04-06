package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class DefineUniformGenerator implements ICoordX {
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
        System.out.println("Varibales Y in DefineUniformGenerator: b = " + coordY.getC0Parametr() + " a = " + coordY.getC1Parametr());
        setXYArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in DefineUniformGenerator): " + getXArrayList());
        System.out.println("New Coordinate Y (in DefineUniformGenerator): " + getYArrayList());
    }


    public void setXYArrayList(int number, int period, int series) {
// Add check for right period later...
        long step = (long) period / number;
        long xParameter;
        double yParameter;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++) {
                xParameter = (long) count * step + period * localSeries;
                yParameter = coordY.getC0Parametr() + xParameter * coordY.getC1Parametr() + xParameter * coordY.getC2Parametr() + xParameter * coordY.getC3Parametr();
                this.xArrayList.add(xParameter);
                this.yArrayList.add(yParameter);
            }
    }

    @Override
    public String toString() {
        return "DefineUniformGenerator{" +
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
