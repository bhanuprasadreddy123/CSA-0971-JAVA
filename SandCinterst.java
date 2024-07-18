class interst
{
    public static void main(String arg[])
    {
       double p=100000,r=1,t=3,n=4;
       double simpleinterst=(p*r*t)/100;
       double compoundamount=p * Math.pow((1+r/(n*100)),n*t);
       double compoundinterst=compoundamount-p;
       System.out.println("simpleinterst:"+simpleinterst);
       System.out.println("compoundinterst="+compoundinterst);
    }
}