

public class Search {
    public static int SearchELe(int[] arr,int ci,int sv )
    {
        if(arr[ci]!=sv)
        {

            return SearchELe(arr,ci+1,sv);
        }
       return ci;
    }

    public static void main(String[] args) {

        int[] arr={1,2,4,2,6};
        System.out.println(SearchELe(arr,0,2));
    }
}
