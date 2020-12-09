package test;

import lab0.Variant5;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestVariant5 {

    @Test
    public void massTest() {
        assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test(dataProvider = "integerTaskProvider")
    public void integerTaskTest(int number1, int number2, int expected) {
        Variant5 item = new Variant5();
        long actual = Variant5.integerTask(number1, number2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] integerTaskProvider() {
        return new Object[][]{{10, 2, 0}, {9, 5, 4}, {14, 3, 2}};
    }


    @Test(dataProvider = "booleanTaskProvider")
    public void booleanTaskTest(int number1, int number2, boolean expected) {
        Variant5 item = new Variant5();
        boolean actual = item.booleanTask(number1, number2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] booleanTaskProvider() {
        return new Object[][]{{0, -3, true}, {3, -10, true}, {1, 1, false}};
    }


    @Test(dataProvider = "ifTaskProvider")
    public void ifTaskTest(int number1, int number2, int number3, int expected) {
        Variant5 item = new Variant5();
        int[] actual = item.ifTask(number1, number2, number3);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] ifTaskProvider() {
        return new Object[][]{{1, 2, -3, new int[]{2, 1}}, {-5, -7, 1, new int[]{1, 2}}};
    }

    @Test(dataProvider = "caseTaskProvider")
    public void caseTaskTest(int number1, float number2, float number3, float expected) {
        Variant5 item = new Variant5();
        float actual = item.caseTask(number1, number2, number3);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] caseTaskProvider() {
        return new Object[][]{{1, 10, 2, 12}, {2, 10, 2, 8}, {3, 10, 2, 20}, {4, 10, 2, 5}};
    }



    @Test(dataProvider = "forTaskProvider")
    public void forTaskTest(float number1, float[] expected) {
        Variant5 item = new Variant5();
        float[] actual = item.forTask(number1);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] forTaskProvider() {
        return new Object[][]{{3, new float[]{(float) 0.3, (float) 0.6, (float) 0.9, (float) 1.2, (float) 1.5, (float) 1.8, (float) 2.1, (float) 2.4, (float) 2.7, (float) 3.0}}};
    }


    @Test(dataProvider = "whileTaskProvider")
    public void whileTaskTest(int number1, int expected) {
        Variant5 item = new Variant5();
        int actual = item.whileTask(number1);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] whileTaskProvider() {
        return new Object[][]{{64, 6}, {8, 3}};
    }

    @Test(dataProvider = "minMaxTaskProvider")
    public void minMaxTaskTest(int n, float[] massive1, float[] massive2, float[] expected) {
        Variant5 item = new Variant5();
        float[] actual = item.minmaxTask(n, massive1, massive2);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] minMaxTaskProvider() {
        return new Object[][]{{3, new float[]{6, 8, 10}, new float[]{3, 2, 5}, new float[]{1, 4}}};
    }

    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(int number1, int[] expected) {
        Variant5 item = new Variant5();
        int[] actual = item.arrayTask(number1);
        assertEquals(actual,expected);
    }

    @DataProvider
    public Object[][] arrayTaskProvider() {
        int[] out = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        return new Object[][]{{9, out}};
    }

    @Test(dataProvider = "matrixTaskProvider")
    public void matrixTaskTest(int number1, int number2, int number3, int[] list, int[][] expected) {
        Variant5 item = new Variant5();
        int[][] actual = item.matrixTask(number1, number2, number3, list);
        for (int i = 0; i < number1; i++) {
            assertEquals(actual[i],expected[i]);
        }
    }

    @DataProvider
    public Object[][] matrixTaskProvider() {
        int[] input = {1, 3, 5};
        int[][] output= {{1, 1, 1},
                {2, 4, 6},
                {3, 7, 11}};
        return new Object[][]{{3,3, input, output}};
    }


}




