import java.util.*;
class prime
  {
    void check()
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int flag=0;
    int m=n/2;
    if (n==0 || n==1)
    {
        System.out.println("Wrong choice, try something greater than 1.");
    }
    else
    {
    for(int i=2;i<=m;i++)
    {
        if(n%i==0)
        {
            System.out.println(n + " is not a prime number");
        
        flag=1;
        break;
    }
}
sc.close();

    if(flag==0)
    {
        System.out.println("yes, its a prime number");
    }
}
}

  public static void main(String args[])
  {
    System.out.println("enter the number to be checked:");
    prime obj = new prime();
    obj.check();
  }
}
