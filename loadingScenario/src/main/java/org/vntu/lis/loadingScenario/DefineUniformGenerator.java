package org.vntu.lis.loadingScenario;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;

// The DefineUniformGenerator class uses deterministic exploration methods.
public class DefineUniformGenerator implements ICoordX {
    final private ArrayList<Long> xArrayList = new ArrayList<Long>();
    final private ArrayList<Double> yArrayList = new ArrayList<Double>();

    private CoordX coordX;
    private  CoordY coordY;

    @Override
    public void downloadContext() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "coordinatesContext.xml"
        );

        this.coordX = context.getBean("coordX", CoordX.class);
        this.coordY = context.getBean("coordY", CoordY.class);

        context.close();
        // For Diagnostics only:
//        System.out.println("Varibales Y in DefineUniformGenerator: b = " + coordY.getC0Parametr() + " a = " + coordY.getC1Parametr());
        setXYArrayList(coordX.getNumber(), coordX.getPeriod(), coordX.getSeries());
        // For Diagnostic purposes only
        System.out.println("New Coordinate X (in DefineUniformGenerator): " + getXArrayList());
        System.out.println("New Coordinate Y (in DefineUniformGenerator): " + getYArrayList());
    }

// The method setXYArrayList is solving a polynomial equation.
    public void setXYArrayList(int number, int period, int series) {
// Add check for right period later...
        long step = (long) period / number;
        long xParameter;
        double yParameter;

        int localSeries = -1;

        while (localSeries++ < series - 1)
            for (int count = 0; count < number; count++) {
                xParameter = (long) count * step + period * localSeries;
                yParameter = coordY.getC0Parametr() + xParameter * coordY.getC1Parametr() + Math.pow(xParameter,2) * coordY.getC2Parametr() + Math.pow(xParameter,3) * coordY.getC3Parametr();
                this.xArrayList.add(xParameter);
                this.yArrayList.add(yParameter);
            }
    }

    @Override
    public String toString() {
        return "DefineUniformGenerator{" +
                "arrayList=" + xArrayList +
                '}';
    }

    public ArrayList<Long> getXArrayList() {
        return xArrayList;
    }

    public ArrayList<Double> getYArrayList() {
        return yArrayList;
    }

//    public void writeCsvFile(String csvFileName) {
//        System.out.println("FileName: " + csvFileName);
//    }

    public void writeCsvFile(String csvFileName) {
        List arrList = new ArrayList<String>();
        arrList.add("Java");
        arrList.add("Programming");
        arrList.add("Language");

        Path output = Paths.get("output.txt");
        try {
            Files.write(output, arrList);
            System.out.println(output.toFile().getParentFile());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // https://www.codeproject.com/Questions/1070466/how-to-write-a-string-arraylist-on-the-file-using
    public void printArrayListToFile(ArrayList<String> arrayList, String filename) throws FileNotFoundException {
        ArrayList<Long> xArrayList = getXArrayList();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Long item : xArrayList) {
            writer.println(item);
        }
        writer.close();
    }
}
