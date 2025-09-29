import java.util.Random;


public class Main {
    public static void main(String[] args) {
        short[] w = new short[12];
        for (int i = 0; i < 12; i++) {
            w[i] = (short)(2 * i + 1);
        }


        int[] x = new int[16];
        Random rnd = new Random();
        for (int j = 0; j < 16; j++) {
            x[j] = -4.0 + 16.0 * rnd.nextDouble();
        }


        int[][] s = new int[12][16];


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                int val = x[j];

                if (w[i] == 7) {
                    // формула 1
                    int sqrtAbs = Math.sqrt(Math.abs(val));
                    if (sqrtAbs > 0) {
                        int logVal = Math.log(sqrtAbs);
                        int denominator = Math.PI - Math.cos(Math.atan((val + 4) / 16.0));
                        if (denominator != 0) {
                            s[i][j] = Math.pow(logVal, 0.5 / denominator);
                        } else {
                            s[i][j] = Double.NaN;
                        }
                    } else {
                        s[i][j] = Double.NaN;
                    }
                }

                else if (w[i] == 1 || w[i] == 3 || w[i] == 9 || w[i] == 15 || w[i] == 17 || w[i] == 21) {
                    // формула 2
                    int tanVal = Math.tan(val);
                    if (tanVal != 0) {
                        s[i][j] = (1.0 / 3.0) * (0.5 - Math.pow(0.5 / tanVal, 2));
                    } else {
                        s[i][j] = Double.NaN;
                    }
                }

                else {
                    // формула 3
                    int a = Math.pow(Math.exp(val), Math.pow((val - 1) / 4.0, 3) / 2.0) / 2.0;
                    if (val != 0) {
                        int b = Math.pow(2.0 / Math.cos(val), Math.pow((val + 2.0 / 3.0) / val, 2));
                        s[i][j] = Math.cbrt(Math.pow(a, b));
                    } else {
                        s[i][j] = Double.NaN;
                    }
                }
            }
        }


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%10.4f ", s[i][j]);
            }

            System.out.println();
        }
    }
}
