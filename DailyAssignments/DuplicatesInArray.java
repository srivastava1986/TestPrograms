public class DuplicatesInArray {
    public static void main(String[] args) {
        int a[] = {2, 3, 1, 2, 3};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[j]);
            }
        }
    }
}