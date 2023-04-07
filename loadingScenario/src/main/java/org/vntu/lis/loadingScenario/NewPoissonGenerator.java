package org.vntu.lis.loadingScenario;

import java.util.Random;

public class NewPoissonGenerator {
    private Random random;
    private double lambda;

/*
    public NewPoissonGenerator(double lambda) {
        this.random = new Random();
        this.lambda = lambda;
    }
*/

    public int generate(double lambda) {
        this.random = new Random();
        this.lambda = lambda;

        double L = Math.exp(-lambda);
        double p = 1.0;
        int k = 0;

        do {
            k++;
            p *= random.nextDouble();
        } while (p > L);

        return k - 1;
    }

}
