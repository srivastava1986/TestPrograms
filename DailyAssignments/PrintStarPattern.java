public class PrintStarPattern {
    public static void main(String[] args) {
//        print(2);
//        printStar(4);
//        prntStars(4);
        printUsingRec(4);

    }
    public static void print(int n){
        for (int i=0; i<n; i++) {

            System.out.println("*");
            System.out.println("**");
        }
    }

    //for loop
    public static void printStar(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
        }
    }

    //While loop
    public static void prntStars(int y) {
        int i = 1;
        while (i <= y) {
            if (i % 2 == 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
            i++;
        }
    }

    //Using Recursion
    public static void printUsingRec(int z) {

        if (z > 0) {
            if (z % 2 != 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
            z--;
            printUsingRec(z);
        }

    }
}
