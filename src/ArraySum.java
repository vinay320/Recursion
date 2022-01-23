import java.util.Scanner;

public class ArraySum {

    public static int Sum(int[] arr,int i)
    {
        if(i==0)
        {
            return arr[i];
        }
        return arr[i]+Sum(arr,--i);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            {
                arr[i]=s.nextInt();
            }

            int x=Sum(arr,n-1);
            System.out.println(x);

        }
    }
}
