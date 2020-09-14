import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long d[] = new long[(18 - 4) / 2 + 1];
        int k = 0;
        for (int i = 18; i >= 4; i -= 2, k++) {
            d[k] = i;
        }
        double x[] = new double[17];
        for (int i = 0; i < 17; i++) {
            x[i] = Math.random() * 25f - 12.0f;
        }
        double d1[][] = new double[8][17];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 17; j++) {
                if (d[i] == 4) {
                    d1[i][j] = Math.sin(Math.pow(0.25 * (Math.atan((x[j] + 0.5) / 25) + 2.0 / 3), 2));
                } else if (d[i] == 8 || d[i] == 10 || d[i] == 14 || d[i] == 16) {
                    d1[i][j] = Math.pow(0.75 - Math.tan(Math.log(Math.abs(x[j]))), Math.atan((x[j] + 0.5) / 25));
                } else {
                    d1[i][j] = Math.pow((1 - 0.25 / (2 + Math.cbrt(Math.atan((x[j] + 0.5) / 25)))) / (Math.pow(3 * (Math.pow(x[j] + 3, 2)) / (x[j] * x[j] * x[j] + 1.0 / 3), 3)), 2);
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.printf("%.5f", d1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
