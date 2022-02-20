import java.util.Arrays;

public class RecursiveBinarySearch {
    public boolean search(int[] searchArray, int target) {
        if (searchArray.length == 0) {
            return false;
        }

        int midpoint = Math.floorDiv(searchArray.length, 2);
        if (searchArray[midpoint] == target) {
            return true;
        }

        if (searchArray[midpoint] < target) {
            return search(Arrays.copyOfRange(searchArray, (midpoint + 1), searchArray.length), target);
        }

        return search(Arrays.copyOfRange(searchArray, 0, (midpoint - 1)), target);
    }

    public void verify(boolean result) {
        System.out.println("Target found: " + result);
    }
}
