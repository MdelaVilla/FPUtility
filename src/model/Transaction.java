package model;

public class Transaction {

    private Complexity complexity;
    private int[] det;
    private String name;
    private int[] ret;
    private Type type;

    public Transaction(String name, Type type, int det, int ret, int... rest) {
        this.name = name;
        this.type = type;
        switch (type) {
            case EI:
                this.det = new int[]{det};
                this.ret = new int[]{ret};
                complexity = IFPUG.CalcComplexityEI(det, ret);
                break;
            case ELF:
                this.det = new int[]{det};
                this.ret = new int[]{ret};
                complexity = IFPUG.CalcComplexityELF(det, ret);
                break;
            case EO:
                this.det = new int[]{det};
                this.ret = new int[]{ret};
                complexity = IFPUG.CalcComplexityEO(det, ret);
                break;
            case EQ:
                this.det = new int[]{det, rest[0]};
                this.ret = new int[]{ret, rest[1]};
                complexity = IFPUG.CalcComplexityEQ(det, ret, rest[0], rest[1]);
                break;
            case ILF:
                this.det = new int[]{det};
                this.ret = new int[]{ret};
                complexity = IFPUG.CalcComplexityILF(det, ret);
                break;
        }
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public int[] getDet() {
        return det;
    }

    public String getName() {
        return name;
    }

    public int[] getRet() {
        return ret;
    }

    public Type getType() {
        return type;
    }

}
