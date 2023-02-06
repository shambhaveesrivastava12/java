class pattern3
{
  void patt(int n)
  {
    for(int i=0;i<n;i++)
      {
        for(int j=n-i;j>1;j--)
          {
            System.out.print(" ");
          }
         for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
        System.out.println();
      }
  }
  public static void main(String args[])
  {
    pattern3 obj = new pattern3();
    obj.patt(4);
  }
}