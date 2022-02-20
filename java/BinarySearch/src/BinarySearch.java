public class BinarySearch {
    private int[] searchArray;
    private int target;

    public BinarySearch(int[] searchArray, int target) {
        this.searchArray = searchArray;
        this.target = target;
    }

    // returns index if found, returns -1 if not found
    public int search() {
        int first = 0;
        int last = this.searchArray.length - 1;

        while (first <= last) {
            int midpoint = Math.floorDiv((first + last), 2);

            if (this.searchArray[midpoint] == target) {
                return midpoint;
            }

            if (this.searchArray[midpoint] < target) {
                first = midpoint + 1;
            } else {
                last = midpoint - 1;
            }
        }

        return -1;
    }

    public void verify(int index) {
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array");
        }
    }
}
