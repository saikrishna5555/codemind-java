import java.util.*;
class Saui 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,k;
        a=sc.nextInt();
        k=sc.nextInt();
        int c=0;
        int x[]=new int[a];
        for (int i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<a;i++)
        {
            if ((x[i])%k==0)
            {
                c+=1;
            }
            
        }
        System.out.println(c);
        
    }
}
