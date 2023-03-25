package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class UniformGenerator implements ICoordX {
     private ArrayList<Long> arrayList = new ArrayList<Long>();

    public Long getX() {
        return 0L;
    }
    public void setArrayListX() {
        for (int count = 0; count < 5; count++) {
            this.arrayList.add((long) count * 1000);
        }
//        this.arrayList.add(1000L);
//        this.arrayList.add(2000L);
//        this.arrayList.add((long) 3000L);
    }

    public ArrayList<Long> getArrayListX() {
        return arrayList;
    }

    @Override
    public String toString() {
        return "UniformGenerator {" +
                "arrayList=" + getArrayListX() +
                '}';
    }
}
