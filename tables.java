import java.util.*;
class tables
{
public static void main(String[] args){
int n,m,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number for table:");
n=s.nextInt();
System.out.println("Enter the number  for another table:");
m=s.nextInt();
for(i=1;i<=10;i++){
 
System.out.println(n+"X"+i+" = "+n*i);
}

for(i=1;i<=10;i++){
 
System.out.println(m+"X"+i+" = "+m*i);
}
}
}