package lab0;
import test.TestVariant5;
public class Variant5 {
    public static int integerTask(int a, int b) {
        return a%b;
    }

    public static boolean booleanTask(int a, int b){
        if(a == 0 || b < -2){
            return true;
        }
        else {
            return false;
        }
    }

    public static int[] ifTask(int a, int b, int c){
        int positive = 0, negative = 0;
        if(a >= 0){
            positive += 1;
        }
        else{
            negative += 1;
        }
        if(b >= 0){
            positive += 1;
        }
        else{
            negative += 1;
        }
        if(c >= 0){
            positive += 1;
        }
        else{
            negative += 1;
        }
        int[] result = {positive, negative};
        return result;
    }

    public static float caseTask(int n, float a, float b){
        if(n == 2){
            return a - b;
        }
        else if(n == 3){
            return a * b;
        }
        else if(n == 4 && b != 0){
            return a / b;
        }
        else{
            return a + b;
        }
    }

    public static float[] forTask(float price){
        float[] a = new float[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (float) (((i + 1) / 10.0) * price);
        }
        return a;
    }

    public static int whileTask(int n){
        int k = 1;
        while(n != 2){
            n = n / 2;
            k += 1;
        }
        return k;
    }

    public static float[] minmaxTask(int n, float[] m, float[] v){
        float max = 0, P = 0, index = 0;
        for (int i = 0; i < n; i++) {
            if(max < (m[i] / v[i])){
                index = (float)(i);
                P = m[i] / v[i];
                max = P;
            }
        }
        float[] result = {index, P};
        return result;
    }

    public static int[] arrayTask(int n){
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a;
    }

    public static int[][] matrixTask(int m, int n, int d, int[] massive){
        int[][] matrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            matrix[0][i] = massive[i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = matrix[i - 1][j] + d;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] massive = {1, 2, 5, 8, 10};
        int[][] x = matrixTask(5, 4, 2, massive);

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(x[i][j] + " ");
            }

        }

    }
}
