class pattern
{
    public static void main(String arg[])
    {
      int i,j,rows=5,cols=17;
      for(i=1;i<=rows;i++)
      {
          for(j=1;j<=cols;j++)
          {
              if(i==1||i==rows||j==1||j==cols)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
     
    }
}