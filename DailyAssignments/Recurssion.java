public class Recurssion {
    public static void main(String[] args) {
        //printNumbers(10);
        printnum(20);
    }

    public static void printNumbers(int n){
        // Print N to 1 Using recursion
        if (n>=1){
            System.out.println(n);
            printNumbers(n-1);
        }
    }
    public static void printnum(int N){
        //Print 1 to N Using recursion



        if (1<=N){

            System.out.println(N);


        }
        printnum(N-(N-1));



    }



}



