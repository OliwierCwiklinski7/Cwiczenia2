import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int position = 3;
        System.out.println(Arrays.toString(rotateArray(array, position)));

    }
    public static int[] rotateArray(int[] array, int positions) {
        int x = array.length;
        positions = positions % x;
        int[] wynik = new int[x];
        for (int i = 0; i < x; i++) {
            wynik[(i + positions) %  x] = array[i];

        }
        return wynik;
    }
    }
