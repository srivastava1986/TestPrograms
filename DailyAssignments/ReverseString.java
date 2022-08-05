public class ReverseString {

    public static void main(String[] args) {
        String s= "Swati";        //length=5; charAt=0,1,2,3,4
        for (int i = s.length()-1; i>=0; i--) {
        System.out.print(s.charAt(i));
        }
    }
}

