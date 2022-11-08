import java.util.*;
class Saik
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int s=0;
        for (int i=l;i!=r+1;i++)
        {
            if (i%k==0)
            {
                s+=1;
            }
        }
        
        System.out.println(s);
        
    }
}