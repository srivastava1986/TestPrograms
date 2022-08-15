class Calculator{
    int num1;
    int num2;
    int result;

    public Calculator(){
        num1=6;
        num2=4;
        result=num1+num2;
    }
    public Calculator(int x, int y){
        num1=x;
        num2=y;
        result=num1+num2;
    }
}

public class DemoConstructor {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        System.out.println(c.result);

        Calculator c1= new Calculator(20,20);
        System.out.println(c1.result);

    }
}
