package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class ClassicUniformGenerator implements ICoordX {
     final private ArrayList<Long> arrayList = new ArrayList<Long>();



    public void setArrayListX(int number, int period, int series) {
// Add check for right period later...
        long step = (long) period/number;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }



    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

}
