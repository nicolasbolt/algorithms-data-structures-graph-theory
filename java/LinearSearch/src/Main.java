public class Main {
    public static void main(String[] args) {
        int[] testList = new int[] {2, 5, 8, 3, 6, 7, 9};
        LinearSearch linearSearch = new LinearSearch(testList, 22);

        int result = linearSearch.search();
        linearSearch.verify(result);
    }
}
