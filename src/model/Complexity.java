package model;

public enum Complexity {
    S, M, C;

    private static Complexity[][] complexities = {
        {S, S, M},
        {S, M, C},
        {M, C, C}
    };

    public static Complexity calcComplexity(int det, int ret) {
        return complexities[ret][det];
    }

}
