import java.util.Scanner;

public class Number {

    public static void Num(int n)
    {
        if(n<=0)
        {
            return;
        }
        else {
            Num(n-1);
            System.out.println(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Num(n);
    }
}
