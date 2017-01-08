package model.transaction;

import model.Complexity;

public class InternalLogicFile extends Transaction {

    private static int[] max_det = {19, 50, Integer.MAX_VALUE};
    private static int[] max_ret = {1, 5, Integer.MAX_VALUE};

    public InternalLogicFile(String name, int det, int ret) {
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ret > max_ret[++i2]);
        setName(name);
        setComplexity(Complexity.calcComplexity(i1, i2));
    }

}
