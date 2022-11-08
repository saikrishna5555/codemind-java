import java.util.*;
class Sdjl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i!=t;i++)
        {
            int a=sc.nextInt();
            int h=a;
            int r=0;
            while (a!=0)
            {
                int d=a%10;
                r=r*10+d;
                a=a/10;
                
            }
            if (h==r)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
                
        }
    }
}