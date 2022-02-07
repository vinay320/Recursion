// Olympic Medal Count.....
import java.util.Scanner;

public class Olympic
{   int Gold;
    int Silver;
    int Bronze;
    Olympic(int Gold,int Silver,int Bronze)
    {
        this.Gold=Gold;
        this.Silver=Silver;
        this.Bronze=Bronze;
    }
   public static int[] Totalmedal(Olympic[] arr)
    {
        int[] arr1=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i].Gold+arr[i].Silver+arr[i].Bronze;
        }
        return arr1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Olympic[] arr=new Olympic[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=new Olympic(s.nextInt(),s.nextInt(),s.nextInt());

        }
        int[] a=Totalmedal(arr);
        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]);
        }
    }
}
