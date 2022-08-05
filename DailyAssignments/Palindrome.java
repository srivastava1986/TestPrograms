public class Palindrome {
    public static void main(String[] args) {

        String s="madam";
        String s1="";
        String s2="";

        //Read left to right
        System.out.println(s.length());

        for(int i=0;i<s.length();i++) {
            char c1=s.charAt(i);
            s1=s1+c1;

        }

        for(int j=s.length()-1;j>=0;j--) { //for(int j=2;j>=0;j--)
            char c2=s.charAt(j);
            s2=s2+c2;
        }

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("This is a Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }
}
