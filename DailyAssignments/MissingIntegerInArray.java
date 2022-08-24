public class MissingIntegerInArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,7};
        missingInt(arr);
    }

    public static void missingInt(int[] arr){
        int x= arr.length;
        int y= x+1;
        int sum=0;
        int sumN=(y*(y+1))/2;
        for(int i=0; i<arr.length; i++){
            sum=sum+ arr[i];
        }
        int missingnum=sumN-sum;
        System.out.println("The Missing number is:" + missingnum);
    }
}
