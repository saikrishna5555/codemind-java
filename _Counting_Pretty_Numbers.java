import java.util.*;
class Countin
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int j=0;j<t;j++)
        {
            int l,r;
            l=sc.nextInt();
            r=sc.nextInt();
            int c=0;
            for (int i=l;i<=r;i++)
            {
                int d=i%10;
                if (d==3 || d==2 ||d==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}