import java.util.*;
class Positive_negitive_square
{
	public static void main(String arg[])
	{
		int n,sq,ng,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE  number ");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		
			sq=i*i;
			if(n==sq)
			{
			ng=i*(-1);
			System.out.println("positive  IS :  "+i);
			System.out.println("NEGITIVE  IS :  "+ng);
			}
	    }
	

			
	}
}