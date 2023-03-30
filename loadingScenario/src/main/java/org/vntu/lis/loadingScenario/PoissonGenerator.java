package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public class PoissonGenerator implements ICoordX {
    ArrayList arrayList = new ArrayList();

    @Override
    public void downloadContext() {
        System.out.println("Downloading Context from PoissonGenerator");
    }

    public ArrayList<Long> getXArrayList() {
        return arrayList;
    }

    public void setXArrayList(int firstOption, int secondOption, int thirdOption) {

    }
}
