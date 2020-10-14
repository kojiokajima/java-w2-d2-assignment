public class BinarySearch {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};

        int index = binarySearch(testArray, 19);

        System.out.println("The index is " + index);

    }

    public static int binarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while (arr[middle] != target) {
            if (arr[middle] < target) {
                left = middle;
            } else if (arr[middle] > target) {
                right = middle;
            }
            middle = (left + right) / 2;
        }
        
        return middle;

    }
}