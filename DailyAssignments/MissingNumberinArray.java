public class MissingNumberinArray {
    public static void main(String[] args) {
        int n=7;
        int sumN=(n*(n+1))/2;
        int a[]= {1,2,3,4,5,7};
        int sum=0;
        for(int i=0; i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int missval= sumN-sum;
        System.out.println("The missing number is: "+ missval);
    }
}
