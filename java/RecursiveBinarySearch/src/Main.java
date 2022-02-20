public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[] {2, 5, 123, 6, 23, 7, 34, 32, 72, 9};
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        boolean result = recursiveBinarySearch.search(testArray, 34);
        recursiveBinarySearch.verify(result);
    }
}
