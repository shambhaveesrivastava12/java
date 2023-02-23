import java.util.*;
 class fibonacci
{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum;
    void fib()
    {
     int a1=0;
     int a2=1;
     System.out.print(a1+ " " +a2);
     for(int i=2;i<=n;i++)
     {
     sum=a1+a2;
     System.out.print(" " + sum);
     a1=a2;
     a2=sum;
     }
     
    }
}
class Main
  {
    public static void main(String args[])
    {
        System.out.print("enter the limit of your choice:");
        fibonacci obj = new fibonacci();
        obj.fib();
    }
}