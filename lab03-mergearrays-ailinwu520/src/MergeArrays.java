import java.util.Arrays;

public class MergeArrays {
    /**
     * Function that takes in two arrays arr1,arr2, and two integer m,n
     * merge m elements from arr1 and n elements from arr2 into arr1
     *
     * @param arr1 1st array of elements, has size of m+n
     * @param m    m elements to be merged,
     * @param arr2 2nd array of elements, has size of n
     * @param n    n elements to be merged
     */
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        // last variable in each array and merge
        int first = m - 1, second = n - 1, i = m + n - 1;

        while (second >= 0) {
            // comparison
            if (first >= 0 && arr1[first] > arr2[second]) {
                //add value in the position
                arr1[i--] = arr1[first--];
            } else {
                //array 2 grater
                arr1[i--] = arr2[second--];
            }
        }
    }

    public static void main(String[] args) {
        //Modify the main as needed to test
        MergeArrays ma = new MergeArrays();
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 7};
        int m = 3, n = 3;
        ma.merge(arr1, m, arr2, n);
        System.out.println("Expected: [1, 2, 2, 3, 5, 7]");
        System.out.println("Actual:   " + Arrays.toString(arr1));
    }
}
