package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

// The ClassicUniformGenerator class uses probabilistic exploration methods.
public class PoissonGenerator implements ICoordX {
    final private ArrayList<Long> xArrayList = new ArrayList<Long>();
    final private ArrayList<Double> yArrayList = new ArrayList<Double>();

    private CoordX coordX;
    private  CoordY coordY;

    private double lambda;


    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        this.coordX = context.getBean("coordX", CoordX.class);
        this.coordY = context.getBean("coordY", CoordY.class);

        context.close();
        // For Diagnostics only:
        System.out.println("Varibales Y in PoissonGenerator: b = " + coordY.getC0Parametr() + " a = " + coordY.getC1Parametr());
        setXYArrayList(coordX.getNumber(), coordX.getMean(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in PoissonGenerator): " + getXArrayList());
        System.out.println("New Coordinate Y (in PoissonGenerator): " + getYArrayList());
        }


    public void setXYArrayList(int number, int period, int series) {

        int maxValue = period;
        int rangeValue = maxValue;
        int randomNumber;
        double lambda = (double) period / 2;

        boolean containsRandomNumber = false;
        Random random = new Random();

        int localSeries = -1;

        while (localSeries++ < series - 1) {
            ArrayList<Long> tempArrayList = new ArrayList<Long>();

            for (int count = 0; count < number; count++) {
                // Checking the unique value of a variable
                do {
                    randomNumber = 0;
                    double L = Math.exp(-lambda);
                    double p = 1.0;

                    do {
                        randomNumber++;
                        p *= random.nextDouble();
                    } while (p > L);

                    containsRandomNumber = tempArrayList.contains((long) randomNumber);
                } while (containsRandomNumber);
                tempArrayList.add((long) randomNumber);
                this.yArrayList.add(1.0);
            }
            Collections.sort(tempArrayList);
            this.xArrayList.addAll(tempArrayList);
        }

    }

    @Override
    public String toString() {
        return "PoissonGenerator{" +
                "arrayList=" + xArrayList +
                '}';
    }

    public ArrayList<Long> getXArrayList() {
        return xArrayList;
    }

    public ArrayList<Double> getYArrayList() {
        return yArrayList;
    }

    public void writeCsvFile(String csvFileName) {
        System.out.println("FileName: " + csvFileName);
    }

}
