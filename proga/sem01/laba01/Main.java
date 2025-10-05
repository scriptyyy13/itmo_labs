import java.util.Random;

public class Main {
    public static void main(String[] args) {
        short[] w = new short[12];
        for (int i = 0; i < 12; i++) {
            w[i] = (short)(2 * i + 1);
        }

        double[] x = new double[16];
        Random rnd = new Random();
        for (int j = 0; j < 16; j++) {
            x[j] = -4.0 + 16.0 * rnd.nextDouble();
        }

        double[][] s = new double[12][16];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                s[i][j] = computeElement(w[i], x[j]);
            }
        }

        printMatrix(s);
    }


    // вычисление элемента массива
    public static double computeElement(short wVal, double xVal) {
        if (wVal == 7) {
            // формула 1
            double sqrtAbs = Math.sqrt(Math.abs(xVal));
            if (sqrtAbs > 0) {
                double logVal = Math.log(sqrtAbs);
                double denominator = Math.PI - Math.cos(Math.atan((xVal + 4) / 16.0));
                if (denominator != 0) {
                    return Math.pow(logVal, 0.5 / denominator);
                } else {
                    return Double.NaN;
                }
            } else {
                return Double.NaN;
            }
        } else if (wVal == 1 || wVal == 3 || wVal == 9 || wVal == 15 || wVal == 17 || wVal == 21) {
            // формула 2
            double tanVal = Math.tan(xVal);
            if (tanVal != 0) {
                return (1.0 / 3.0) * (0.5 - Math.pow(0.5 / tanVal, 2));
            } else {
                return Double.NaN;
            }
        } else {
            // формула 3
            double a = Math.pow(Math.exp(xVal), Math.pow((xVal - 1) / 4.0, 3) / 2.0) / 2.0;
            if (xVal != 0) {
                double b = Math.pow(2.0 / Math.cos(xVal), Math.pow((xVal + 2.0 / 3.0) / xVal, 2));
                return Math.cbrt(Math.pow(a, b));
            } else {
                return Double.NaN;
            }
        }
    }

    // печать матрицы
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%12.3e", value);
            } System.out.println();
        }
    }
}
