package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class LinearFunction implements ICoordY {
    /**
     * @return 
     */
    public ArrayList<Long> getYArrayList() {
        return null;
    }

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CoordY coordY = context.getBean("coordY", CoordY.class);
//        setXArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        System.out.println("New Coordinate Y (in ClassicGenerator): ");

    }


    public void setXPolinomList(double parametrB, int period, int series) {
// Add check for right period later...
    }

}
