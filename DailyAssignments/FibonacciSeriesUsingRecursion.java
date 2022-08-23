public class FibonacciSeriesUsingRecursion {

    static int a=0,b=1,c;

    public static void main(String[] args) {
        //System.out.println(a +""+ b);
        FibonacciSeriesUsingRecursion obj=new FibonacciSeriesUsingRecursion();
        obj.printFibonacci(10);

    }
    public void printFibonacci(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFibonacci(i-1);

        }

    }
}
