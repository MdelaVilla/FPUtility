package controler;

public class SummaryTools {

    public static int[] totalize(int[][] summary, int[][] heft) {
        int[] result = new int[6];
        result[5] = 0;
        for (int i = 0; i < 5; i++) {
            result[i] = 0;
            for (int j = 0; j < 3; j++) {
                result[i] += (summary[i][j] * heft[i][j]);
            }
            result[5] += result[i];
        }
        return result;
    }

    public static int sum(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}
