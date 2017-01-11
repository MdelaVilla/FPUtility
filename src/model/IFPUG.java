package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class IFPUG extends Observable {

    public static final int TRANSATION_ADDED = 0;
    public static final int FEATURES_CHANGED = 1;

    private static final IFPUG INSTANCE = new IFPUG();
    private static final Complexity[][] COMPLEXITIES = {
        {Complexity.S, Complexity.S, Complexity.M},
        {Complexity.S, Complexity.M, Complexity.C},
        {Complexity.M, Complexity.C, Complexity.C}
    };

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityEI(int det, int ftr) {
        int[] max_det = {4, 15, Integer.MAX_VALUE};
        int[] max_ftr = {1, 2, Integer.MAX_VALUE};
        int i1 = -1, i2 = -2;
        while (det > max_det[++i1]);
        while (ftr > max_ftr[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityELF(int det, int ret) {
        int[] max_det = {19, 50, Integer.MAX_VALUE};
        int[] max_ret = {1, 5, Integer.MAX_VALUE};
        int i1 = -1, i2 = -2;
        while (det > max_det[++i1]);
        while (ret > max_ret[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    @SuppressWarnings("empty-statement")
    public static Complexity CalcComplexityEO(int det, int ftr) {
        int[] max_det = {5, 19, Integer.MAX_VALUE};
        int[] max_ftr = {1, 3, Integer.MAX_VALUE};
        int i1 = -1, i2 = -2;
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
        int i1 = -1, i2 = -2;
        while (det > max_det[++i1]);
        while (ret > max_ret[++i2]);
        return COMPLEXITIES[i2][i1];
    }

    public static IFPUG getInstance() {
        return INSTANCE;
    }

    private int[] features;
    private List<Transaction> transactions;

    private IFPUG() {
        features = new int[14];
        Arrays.fill(features, 5);
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        setChanged();
        notifyObservers(TRANSATION_ADDED);
    }

    public int[] getFeatures() {
        return features;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setFeatures(int[] features) {
        this.features = features;
        setChanged();
        notifyObservers(FEATURES_CHANGED);
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        setChanged();
        notifyObservers(TRANSATION_ADDED);
    }

    public int[][] getSummary() {
        int[][] summary = new int[5][3];
        for (int[] row : summary) {
            Arrays.fill(row, 0);
        }
        transactions.forEach((t) -> {
            summary[t.getType().ordinal()][t.getComplexity().ordinal()]++;
        });
        return summary;
    }

}
