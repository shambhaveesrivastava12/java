class pattern
  {
    void star(int row)
    {
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<=i;j++)
        {
          System.out.print("*");
        }
      System.out.println();
    }
    }
public static void main(String args[])
  {
  pattern obj = new pattern();
  obj.star(6);
  }
  }