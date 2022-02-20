public class Main {
    public static void main(String[] args) {
        int[] testList = new int[] {2, 5, 8, 3, 6, 7, 9};
        BinarySearch binarySearch = new BinarySearch(testList, 7);

        int result = binarySearch.search();
        binarySearch.verify(result);
    }
}
