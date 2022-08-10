import java.sql.SQLOutput;

public class FrequencyofIntegersinSortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 30, 30};
        int N= arr.length;
        System.out.println(arr.length);
        int freq=1;
        for (int i=1; i<N; i++)
        {
            if (arr[i]==arr[i-1])
            {
                freq++;

            }
        }
        System.out.println("Frequency of "+arr[N-1]+ " is: "+freq);

    }
}
