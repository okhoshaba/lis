package org.vntu.lis.loadingScenario;

import java.util.ArrayList;
import java.util.Iterator;

public class LineScenario {
    private ICoordX defineUniformGenerator = new DefineUniformGenerator();

    private ArrayList<Long> arrayListY = new ArrayList<Long>();

    public LineScenario() {
        // Download all coordinate parameters from configuration file (coordinatesContext.xml)
        defineUniformGenerator.downloadContext();
    }

    private ArrayList<Long> arrayListX = defineUniformGenerator.getXArrayList();

    public void calculateScenario() {
        for (Long items:
             arrayListX) {
            System.out.println("item X: " + (long) (items * 2.3) );
        }
/*
//            if (coordY.getxParametr() != 0L)
//                arrayListY.add((long) ((long) coordY.getbParametr() + arrayListX.get(Math.toIntExact(items)) * coordY.getxParametr()));
//            arrayListY.add(arrayListX.get(Math.toIntExact(items)));
//            System.out.println("Coord X: " + items);
//            arrayListY.add((long) ((long) items + coordY.getbParametr()));
//            arrayListY.add((Long) Math.round(coordY.getbParametr()) );
            System.out.println(Math.round(coordY.getbParametr()));
        }
*/

//        System.out.println("aa " + coordY.getbParametr());

//        System.out.println("ArrayListY: " + arrayListY);
//        arrayListY.add((long) coordY.getbParametr());

    }
}
