package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class DefineUniformGenerator implements ICoordX {
    final private ArrayList<Long> arrayList = new ArrayList<Long>();

    /**
     * @param parameters
     */
    public void setArrayListX(int... parameters) {
        int step = parameters[0];
        int period = parameters[1];
        int series = parameters[2];

// Working fine !!!

    }

    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

    public void setArrayListX(int step, int period, int series) {
        int number = period/step;

        int localSeries = -1;

        // Check it!
        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++)
                this.arrayList.add((long) count * step + period * localSeries);
    }

}
