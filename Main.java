public class Main {
    public static void main(String[] args) {
        int[] array = {3,3,3,2,2};
        System.out.println(findDominant(array));

    }

    public static int findDominant(int[] array) {
        int z = array.length;
            for (int i = 0; i < z; i++) {
                int count = 0;

            for (int j = 0; j < z; j++) {
                if (array[i] == array[j]) {
                count++;
            }
        }
            if (count > z/2) {
            return array[i];
        }
    }
        return -1;
    }}
