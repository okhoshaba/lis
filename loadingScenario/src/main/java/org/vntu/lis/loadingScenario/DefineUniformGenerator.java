package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class DefineUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();


    public ArrayList<Long> getXArrayList() {
        return arrayList;
    }

    public void setXArrayList(int step, int period, int series) {
        int number = period/step;

        int localSeries = -1;

        // Check it!
        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }

}
