import static java.util.Arrays.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int k;
        double A = 0, B = 0, i, j;
        double[] z = new double[1760];
        char[] output = new char[1760];
        //clear screen
        out.print("\u001b[2J");
        for (; ; ) {
            fill(output, 0, 1760, ' ');
            fill(z, 0, 1760, 0);
            for (j = 0; 6.28 > j; j += 0.07)
                for (i = 0; 6.28 > i; i += 0.02) {
                    double c = sin(i), d = cos(j), e = sin(A), f = sin(j), g = cos(A), h = d + 2, D = 1 / (c * h * e + f * g + 5), l = cos(i), m = cos(B), n = sin(B), t = c * h * g - f * e;
                    int x = (int) (40 + 30 * D * (l * h * m - t * n)), y = (int) (12 + 15 * D * (l * h * n + t * m)), o = x + 80 * y, N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (y < 22 && y > 0 && x > 0 && x < 80 && D > z[o]) 
                    {
                        z[o] = D;
                        output[o] = new char[]{'.', ',', '-', '~', ':', ';', '=', '!', '*', '#', '$', '@'}[max(N, 0)];
                    }
                }
            //move cursor to top
            out.print("\u001b[H");

            //print array b
            for (k = 0; k < output.length; k++) out.print(k % 80 != 0 ? output[k] : 10);
            A += 0.04;
            B += 0.02;
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}