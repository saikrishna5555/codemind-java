import java.util.*;
class Saui 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int t=a;
        int r=0;
        while (a!=0)
        {
            int d=a%10;
            r=r*10+d;
            a=a/10;
        }
        if (r==t)
        {
            System.out.println("True");
            
        }
        else{
            System.out.println("False");
        }
    }
}
