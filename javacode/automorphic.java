class automorphic
  {
    boolean number(int n)
    {
      int sq=n*n;
      while(n>0){
      if(sq%10 != n%10)
    return false;

      n=n/10;
      sq=sq/10;
      }
      return true;
    }
    public static void main(String args[])
    {
      automorphic obj = new automorphic();
      System.out.println(obj.number(25)?"AUTOMORPHIC":"NOT AUTOMORPHIC");
      System.out.println(obj.number(12)?"AUTOMORPHIC":"NOT AUTOMORPHIC");
    }
  }