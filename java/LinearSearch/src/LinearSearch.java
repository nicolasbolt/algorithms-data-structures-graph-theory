public class LinearSearch {
    private int[] searchList;
    private int target;

    public LinearSearch(int[] searchList, int target) {
        this.searchList = searchList;
        this.target = target;
    }

    // returns index if found, returns -1 if not found
    public int search() {
        for (int i = 0; i < this.searchList.length; i++) {
            if (this.searchList[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // verify the result
    public void verify(int index) {
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array");
        }
    }

}
