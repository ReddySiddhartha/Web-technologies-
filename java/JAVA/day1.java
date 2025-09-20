import java.util.Scanner;
class Main{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int len=0;
        while(a>0)
        {
            len++;
            a/=10;
        }
        System.out.print(len);
    }
}