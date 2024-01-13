public class ArrayOps {
    public static void main(String[] args) {
        // findMissingInt Test.
        // int[] ar = { 0, 1, 3};
        // System.out.println(findMissingInt(ar)); // 2.
        // secondMaxValue Test
        // int [] ar = {0,1,2,3,2,4,7,6,6};
        // System.out.println(secondMaxValue(ar)); // 8
        // int[] ar1 = { 0, 1, 2, 3 };
        // int[] ar2 = { 0, 1, 2, 3, 3, 3 };
        // System.out.println(containsTheSameElements(ar1, ar2));
        // Issorted Test;
        // int[] sorted = { 7, 8, 9 };
        // System.out.println(isSorted(sorted));
    }

    public static int findMissingInt(int[] array) {
        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                return i;
            }
            exist = false;
        }
        return array.length;
    }

    public static int secondMaxValue(int[] array) {
        int length = array.length;
        int max = array[0];
        int secondMax = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= secondMax && array[j] < max) {
                secondMax = array[j];

            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        if (array1.length >= array2.length) {
            for (int i = 0; i < array1.length; i++) {
                boolean exist = false;
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    return false;
                }

            }
            return true;
        } else {
            for (int i = 0; i < array2.length; i++) {
                boolean exist = false;
                for (int j = 0; j < array1.length; j++) {
                    if (array2[i] == array1[j]) {
                        exist = true;
                    }
                }
                if (!exist) {
                    return false;
                }

            }
            return true;
        }

    }

    public static boolean isSorted(int[] array) {
        boolean sorted = false;
        if (array[0] >= array[1]) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    sorted = true;
                } else {
                    sorted = false;
                }

            }
            if (sorted) {
                return sorted;
            }
        }

        if (array[0] < array[1]) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    sorted = true;
                } else {
                    sorted = false;
                }
            }

        }
        return sorted;
    }
}
