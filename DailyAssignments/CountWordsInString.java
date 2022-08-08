// For example String s1 = “Welcome to Appzlogic Family” | The output = 4 as there are 4 words in this string

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Welcome to Appzlogic Family";
        //String s[]= str.split(" ");
        String s[]=str.split("\\s+"); // "\\s+" is used to count any no. of spaces as 1
        System.out.println("Total no. of words in a String is " + s.length);

    }
}
