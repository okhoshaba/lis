package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public interface ICoordX {

    void downloadContext();
    ArrayList<Long> getXArrayList();
    void setXYArrayList(int firstOption, int secondOption, int thirdOption);
    void writeCsvFile(String csvFileName);

}
