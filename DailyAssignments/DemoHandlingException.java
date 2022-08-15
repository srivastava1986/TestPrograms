
public class DemoHandlingException {
    public static void main(String[] args) {
     try {
         int a = 100, b = 0, c;
         c = a / b;               //Arithemetic Exception      //Risky code
         System.out.println(c);
//          String name=null;       //Null Pointer Exception
//          System.out.println(name.length());
     }
     catch(Exception e)
        {
            System.out.println(e);      //Handling code
            System.out.println("You cannot divide by zero");
        }
        System.out.println("Hello");    //will print "Hello" after handling exception
                                        //if "Hello" is not printed then program is terminated
    }
}
