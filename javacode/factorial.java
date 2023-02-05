class factorial
  {
    void fact(int n)
    {
    int f=1;

    for(int i=1;i<=n;i++)
    {
      f=f*i;
    }
     System.out.println(f); 
  }

    public static void main(String args[])
    {
      factorial obj = new factorial();
      obj.fact(3);
    }
  }