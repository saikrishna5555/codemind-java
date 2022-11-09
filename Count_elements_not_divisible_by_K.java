import java.util.*;
class Saikl
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int c=0;
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if ((x[i])%k!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}