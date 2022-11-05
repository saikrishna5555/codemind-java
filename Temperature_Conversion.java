import java.lang.Math;
import java.util.Scanner;
class Sai{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        double r=32+((a*9)/(double)5);
        System.out.printf("%.2f",r);
    }
}