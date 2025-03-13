import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,8,9,10,11};
        int[] filteredArray = filterEvenIndexOddValue(array);
        System.out.println(Arrays.toString(filteredArray));
    }
    public static int[] filterEvenIndexOddValue(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                result[index++] = array[i];
            }
        }
        return result;
    }

}
