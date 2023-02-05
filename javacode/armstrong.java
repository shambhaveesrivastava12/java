class Armstrong
{
  void number(int n)
  {
    int temp,sum=0;
    int last=0;
    temp=n;
    while(temp>0)
      {
        last=temp%10;
        sum+= (last*last*last);
        temp=temp/10;
      }
    if(sum==n)
    {
      System.out.println("armstrong");
    }
    else{
      System.out.println("not armstrong");
    }
  }
  public static void main(String args[])
  {
    Armstrong obj = new Armstrong();
    obj.number(153);
  }
  
}
  