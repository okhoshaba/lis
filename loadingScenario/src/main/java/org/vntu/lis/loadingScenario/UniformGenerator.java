package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class UniformGenerator implements ICoordX {
     final private ArrayList<Long> arrayList = new ArrayList<Long>();

    public Long getX() {
        return 0L;
    }
    public void setArrayListX(long step, int number, int period, int series) {
        int localSeries = -1;

        while (localSeries++ < series)
            for (int count = 0; count < number; count++) {
                this.arrayList.add((long) count * step + period * localSeries);
            }
    }

    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

}
