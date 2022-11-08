import java.util.*;
class Sdjl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=a*a;
        int s=0;
        while (r!=0)
        {
            int d=r%10;
            s+=d;
            r=r/10;
        }
        if (s==a)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
                
        
    }
}