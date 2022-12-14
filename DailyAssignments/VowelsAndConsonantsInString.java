import java.nio.charset.StandardCharsets;

public class VowelsAndConsonantsInString {
    public static void main(String[] args) {
        String str= "Java Programming Language";

        int vowels=0, consonants=0;

        for (int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);

            if ((ch>='a' && ch<='z') || ch>'A' && ch<='Z')
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;

        }
        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);
    }
}
