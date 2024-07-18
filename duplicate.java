
import java.util.Scanner;
class dupe
{
    public static void main(String arg[])
    {
        int i,j,k,size;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the size of array:");
        size=scanner.nextInt();
        int a[]=new int[size];
        System.out.print("enter the element of array:");
        for(i=0;i<size;i++)
        {
            a[i]=scanner.nextInt();
        }
            for(i=0;i<size;i++)
            {
                for(j=i+1;j<size;j++)
                {
                    if(a[i]==a[j])
                    {
                        for(k=j;k<size-1;k++)
                        {
                            a[k]=a[k+1];
                        }
                        j--;
                        size--;
                    }
                }
            }
            System.out.println("Array after removing duplicates:");
            for(i=0;i<size;i++)
            {
                System.out.println(a[i]+" ");
            }
        
    }
}