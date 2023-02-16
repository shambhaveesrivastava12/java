class downward
  {
    void tri(int n)
    {
       for(int i=1;i <=n;i++){
            for(int j=1;j<= n-i;j++){
                System.out.print("* ");
            }
            
            for(int k=1;k<=i; k++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[])
    {
      downward obj = new downward();
      obj.tri(6);
    }
  }