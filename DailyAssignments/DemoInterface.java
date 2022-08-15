//Interface: 1) a)Abstract methods - (public abstract) eg. public abstact void write();
//              b)Fields - (public static final)       eg. public static final int i= 10;
//           2) Empty bodies.

//           3) from 8th Version-    default void write()       4) 9th Version- private methods
//                                       { with body
//                                       }
//                                   static void write()
//                                      { with body
//                                      }
interface Writer {
    public abstract void write();

}
class Pen implements Writer{
    public void write(){
        System.out.println("I am Pen");
    }
}

class Pencil implements Writer{
    public void write(){
        System.out.println("I am Pencil");
    }
}


public class DemoInterface {
    public static void main(String[] args) {
    Writer p= new Pen();
    p.write();

    Writer p1= new Pencil();
    p1.write();

    }
}
