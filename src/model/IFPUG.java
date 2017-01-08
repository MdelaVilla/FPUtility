package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import model.transaction.Transaction;

public class IFPUG extends Observable {

    public static int FEATURES_CHANGED = 1;
    public static int TRANSACTION_ADDED = 0;

    private int[] features;
    private List<Transaction> transactions;

    public IFPUG() {
        transactions = new ArrayList<>();
        features = new int[14];
        Arrays.fill(features, 5);
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
        setChanged();
        notifyObservers(TRANSACTION_ADDED);
    }

    public int[] getFeatures() {
        return features;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Transaction[] getTransactions(Class<? extends Transaction> type,
            Complexity complexity) {
        return (Transaction[]) transactions.stream().
                filter(c -> c.getClass() == type).
                filter(c -> c.getComplexity() == complexity).toArray();
    }

    public void setFeatures(int[] features) {
        this.features = features;
        setChanged();
        notifyObservers(FEATURES_CHANGED);
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
