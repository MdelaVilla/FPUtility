package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class IFPUG extends Observable {

    public static final int TRANSATION_ADDED = 0;
    public static final int FEATURES_CHANGED = 1;

    public static final int[][] heft = {
        {3, 4, 6},
        {4, 5, 7},
        {7, 10, 15},
        {5, 7, 10},
        {3, 4, 6}
    };

    private static final IFPUG INSTANCE = new IFPUG();

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
