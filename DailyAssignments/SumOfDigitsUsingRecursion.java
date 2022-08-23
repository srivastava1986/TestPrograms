public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfdigits(189));
    }


    public static int sumOfdigits(int num){
        if (num==0)
        {
            return 0;
        }
        return num % 10 + sumOfdigits(num/10);
    }

}
