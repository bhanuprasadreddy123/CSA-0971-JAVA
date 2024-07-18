class pattern
{
    public static void main(String arg[])
    {
      int i,j,k,rows=5;
      for(i=rows;i>=1;i--)
      {
          for(j=1;j<=rows-i;j++)
          {
                System.out.print(" ");
          }
          for(k=1;k<=i;k++)
          {
                System.out.print(" * ");
          }
            System.out.println();
      }
    }
}