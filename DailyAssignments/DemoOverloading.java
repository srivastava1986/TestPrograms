public class DemoOverloading {

    void show()
    {
        System.out.println("1");
    }

    void show(String a)
    {
        System.out.println("2");
    }

    void show(int i)
    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        DemoOverloading d =new DemoOverloading();
        d.show();
        d.show("Hello");
        d.show(100);
    }

}
