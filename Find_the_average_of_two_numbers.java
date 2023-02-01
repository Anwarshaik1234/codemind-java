import java.util.*;
class avg
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        double c=(float)(a+b)/2;
        System.out.format("%.4f",c);
    }
}