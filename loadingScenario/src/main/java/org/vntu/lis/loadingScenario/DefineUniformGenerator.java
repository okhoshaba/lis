package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class DefineUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();

    public void setArrayListX(int step, int period, int series) {
        int number = (int) period/step;

        int localSeries = -1;

        // Check it!
        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }

    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

}
