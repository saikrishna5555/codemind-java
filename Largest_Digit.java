import java.util.*;
class Sdjl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while (a!=0)
        {
            int d=a%10;
            a=a/10;
            if (d>s)
            {
                s=d;
            }
            
        }
        System.out.println(s);
    }
}