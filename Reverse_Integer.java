import java.util.*;
class Sdjl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0;
        int c=0;
        if (a<0){
            a=a*-1;
            c=1;
        }
        while (a!=0)
        {
            int d=a%10;
            r=r*10+d;
            a=a/10;
            
        }
        if (c==1){
            r=r*-1;
        }
        System.out.println(r);
    }
}