package model;

public class Calculator {

    private static final Complexity[][] COMPLEXITIES = {
        {Complexity.S, Complexity.S, Complexity.M},
        {Complexity.S, Complexity.M, Complexity.C},
        {Complexity.M, Complexity.C, Complexity.C}
    };

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityEI(int det, int ftr) {
        int[] max_det = {4, 15, Integer.MAX_VALUE};
        int[] max_ftr = {1, 2, Integer.MAX_VALUE};
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ftr > max_ftr[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityELF(int det, int ret) {
        int[] max_det = {19, 50, Integer.MAX_VALUE};
        int[] max_ret = {1, 5, Integer.MAX_VALUE};
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ret > max_ret[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityEO(int det, int ftr) {
        int[] max_det = {5, 19, Integer.MAX_VALUE};
        int[] max_ftr = {1, 3, Integer.MAX_VALUE};
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ftr > max_ftr[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    public static Complexity CalcComplexityEQ(int det_in, int ret_in,
            int det_out, int ret_out) {
        Complexity c1 = CalcComplexityEI(det_in, ret_in),
                c2 = CalcComplexityEO(det_out, ret_out);
        return (c1.compareTo(c2) < 0 ? c2 : c1);
    }

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityILF(int det, int ret) {
        int[] max_det = {19, 50, Integer.MAX_VALUE};
        int[] max_ret = {1, 5, Integer.MAX_VALUE};
        int i1 = -1, i2 = -1;
        while (det > max_det[++i1]);
        while (ret > max_ret[++i2]);
        return COMPLEXITIES[i2][i1];
    }

}
