import java.util.Scanner;

public class Digit {

        public static int DigitCount(int n,int c) {
            if (n > 0) {
                return DigitCount(n / 10, c+1);
            }
            else
            {
                return c;
            }
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int x,y=DigitCount(n,c);
        System.out.println(y);
    }
}
