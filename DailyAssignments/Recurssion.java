public class Recurssion {
    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int n){
        // Print N to 1 Using recursion
        if (n>=1){
            System.out.println(n);
            printNumbers(n-1);

        }
    }
}
