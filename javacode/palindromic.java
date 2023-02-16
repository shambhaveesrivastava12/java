import java.util.*;
class palindrome
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp,rev;
    
    void number()
    {
      temp=n;
      while(n>0)
      {
    int rem = n%10;
    rev = (rev*10)+rem;
    n=n/10;
      }


      if(temp==rev)
      {
        System.out.println("oh, it's a palindromic number");
      }
      else
      {
        System.out.println("it's not a palindromic number");
      }  
  }
    public static void main(String args[])
    {
      System.out.println("ENTER THE NUMBER OF YOUR CHOICE :)");
      palindrome obj = new palindrome();
      obj.number();
    }
  }