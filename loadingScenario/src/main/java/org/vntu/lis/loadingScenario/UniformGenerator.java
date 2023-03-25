package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class UniformGenerator implements ICoordX {
     private ArrayList<Long> arrayList = new ArrayList<Long>();

    public Long getX() {
        return 0L;
    }
    public ArrayList<Long> getArrayListX() {
        this.arrayList.add(1000L);
        arrayList.add(2000L);
        arrayList.add((long) 3000L);
        return arrayList;
    }

    @Override
    public String toString() {
        return "UniformGenerator {" +
                "arrayList=" + getArrayListX() +
                '}';
    }
}
