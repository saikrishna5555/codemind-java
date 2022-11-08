import java.util.*;
class Sdjl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=1;
        int s=0;
        while (a!=0)
        {
            int d=a%10;
            p=p*d;
            s+=d;
            a=a/10;
        }
        System.out.println(Math.abs(s-p));
                
        
    }
}