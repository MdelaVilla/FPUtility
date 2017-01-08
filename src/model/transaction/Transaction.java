package model.transaction;

import model.Complexity;

public class Transaction {

    private Complexity complexity;
    private String name;

    public Transaction() {
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public String getName() {
        return name;
    }

    public void setComplexity(Complexity complexity) {
        this.complexity = complexity;
    }

    public void setName(String name) {
        this.name = name;
    }

}
