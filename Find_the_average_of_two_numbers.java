import java.util.Scanner;
class Sai1{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double r=(a+b)/((double)2);
        System.out.printf("%.4f",r);

    }
}