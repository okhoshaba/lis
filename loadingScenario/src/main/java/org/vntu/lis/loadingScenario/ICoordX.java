package org.vntu.lis.loadingScenario;

import java.util.ArrayList;

public interface ICoordX {
    ArrayList<Long> getArrayListX();
    void setArrayListX(int firstOption, int secondOption, int thirdOption);
    void setArrayListX(int... parameters);
}
