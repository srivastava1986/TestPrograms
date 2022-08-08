// Input  = i.like.this.program.very.much
// Output = much.very.program.this.like.i

public class ReverseWordsInString {

    public static void main(String[] args) {
         String str= "i like this program very much";
         String a[] =str.split(" ");

         for(int i=0; i<a.length;i++)
         {
             System.out.print(a[i] + " ");
         }
        System.out.println("");
         for (int i=a.length-1; i>=0; i--)
         {
             System.out.print(a[i] + " ");
         }
    }
}

