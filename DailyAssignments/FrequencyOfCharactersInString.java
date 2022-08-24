public class FrequencyOfCharactersInString {
    public static void main(String[] args) {
        String s = "We Dooo Testt";
        String s1=s.replace(" ","");
        System.out.println(s1);
        int count=1;

        for(int i=0; i<s1.length();i++){
            i=0;
            for(int j=i+1; j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                   count++;
                }
            }
            System.out.println("The frequency of "+s1.charAt(i)+" is: "+ count);
            s1=s1.replace(""+s1.charAt(i),"");
            count=1;
        }
    }
}
