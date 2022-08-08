public class TwoStringsRotationOfEachOther {

    public static void main(String[] args) {
        String s1= "XYZ";
        String s2= "ZXY";
        if (s1.length() != s2.length())
        {
            System.out.println("Not a Rotation");
            System.exit(0);
        }
        String s3 = s1+ s1; // XYZXYZ
        if (s3.indexOf(s2)!= -1)
        {
            System.out.println("It Is A Rotation");
        }
        else
            System.out.println("Not a Rotation");
    }
}
