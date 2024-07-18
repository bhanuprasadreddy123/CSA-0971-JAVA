import java.util.*;
class Skip_between
{
	public static void main(String arg[])
	{
		int i,m,n,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE STARTING RANGE ");
		m=sc.nextInt();
		System.out.println("ENTER THE END RANGE ");
		n=sc.nextInt();
        System.out.println("ENTER THE NUMBER TO  SKIP ");
        k=sc.nextInt();
		for(i=m;i<=n;i=i+k+1)
		{
			System.out.println(+i);
		}
	}
}
		