package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class UniformGenerator implements ICoordX {
     final private ArrayList<Long> arrayList = new ArrayList<Long>();

    public Long getX() {
        return 0L;
    }
    public void setArrayListX(long step, int number, int period) {
        int localPeriod = 0;
        long coordinateX = 0L;

        while (localPeriod++ < period)
            for (int count = 0; count < number; count++) {
                coordinateX += (long) count * step;
                this.arrayList.add(coordinateX);
            }
    }

    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

}
