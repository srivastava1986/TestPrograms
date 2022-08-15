public class DemoLoopStatements {

    public static void main(String[] args) {
            greaterNumber();
            printNumbers();
            checkNumber();
            printsomething();
            printHello();
            eachDemo();
    }
    //if-else if-else: Print greater number
    public static void greaterNumber() {
        int a = 10, b = 20, c = 30;
        if (a > b && b > c) {
            System.out.println("a is greater");
        } else if (b > c && b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
     }

    //For : Print numbers from 0 to 10
     public static void printNumbers(){
        int x=10;
        for(int i=0; i<=x; i++){
            System.out.println(i);
        }
     }

     //switch case : allows us to execute a block of code among many alternatives.
    public static void checkNumber(){
                int day=4;
                switch(day){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;

        }
    }
    //While : The while loop is considered as a repeating if statement.
    //It is used to iterate a part of the program
    //repeatedly until the specified Boolean condition is true.
    // As soon as the Boolean condition becomes false, the loop automatically stops.
    public static void printsomething(){
        int i=90;
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
    //Do-While: do print till the condition is true.
    public static void printHello(){
        int i=1;
        do{
            System.out.println("Hello");
            i++;
        }
        while(i<=6);
    }
    //for each:
    public static void eachDemo(){
        int[] numbers = {3, 4, 5, 10, 40, 12};
        int sum=0;

        for(int number: numbers){
            sum += number;
        }
        System.out.println("The sum of all numbers in an array is : " +sum);
    }
}
