package model.transaction;

import model.Complexity;

public class ExternalOutput extends Transaction {

    private static int[] max_det = {5, 19, Integer.MAX_VALUE};
    private static int[] max_ftr = {1, 3, Integer.MAX_VALUE};

    public ExternalOutput(String name, int det, int ftr) {
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ftr > max_ftr[++i2]);
        setName(name);
        setComplexity(Complexity.calcComplexity(i1, i2));
    }

}
