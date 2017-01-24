package model;

public class Transaction {

    private Complexity complexity;

    private String name;
    private Type type;

    public Transaction(String name, Type type, Complexity complexity) {
        this.name = name;
        this.type = type;
        this.complexity = complexity;
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

}
