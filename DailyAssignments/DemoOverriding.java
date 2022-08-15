class Vehicle{
    public void model(){

    }
}
class Toyota extends Vehicle{
    public void model()
    {
        System.out.println("Toyota 1010");
    }
}
class Honda extends Vehicle{
    public void model()
    {
        System.out.println("Honda 2020");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        Vehicle obj = new Honda();
        obj.model();
        Vehicle obj2= new Toyota();
        obj2.model();
    }
}
