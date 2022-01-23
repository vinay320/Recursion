public class Search2 {
    public static void SearchELe(int[] arr, int ci, int sv ) {
        if (arr.length > ci) {
            if (arr[ci] == sv) {
                System.out.println(ci);
            }
            SearchELe(arr, ci + 1, sv);
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 7, 4, 7, 6};
        SearchELe(arr, 0, 7);
    }
}
