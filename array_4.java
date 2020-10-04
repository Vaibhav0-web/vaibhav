import java.util.*;
class array_4
{
    public static void main(String args[])
    {
        int o=0,p=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        System.out.println("Enter the number");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(c[i]);
        }
    }
}
