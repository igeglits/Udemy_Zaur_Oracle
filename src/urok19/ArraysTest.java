package urok19;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.sort;

class ArraysTest {
    static int[] array = {1, 6, -8, -4, 9, 45, -3, -34, 0, 88};
    static String array2[][] = {{"apple","orange"},{"hello", "buy", "ok"}, {"car"}};


    static void sortirovka(int[] array) {
        sort(array);
        for (int i : array) {
            out.print(i + " ");
        }
        out.println(Arrays.binarySearch(array, 0));

    }

    static void showArray(String[][] array) {
        out.print("{  ");
        for (int i = 0; i < array.length; i++) {
            out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    out.print(array[i][j] + ", ");
                } else {
                    out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                out.print("}, ");
            }else{
                out.print("  }");
            }
        }
        out.print(" }");
    }

    public static void main(String[] args) {
        sortirovka(array);
        showArray(array2);
        showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
    }
}
