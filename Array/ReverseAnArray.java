public class ReverseAnArray {
    public static void reverseAnArray(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arr1[] = { (arr.length / 2) };
        for(int i=0;i<arr1.length;i++){
                    System.out.println(arr1[i]+" ");
        }

        int arr2[] = { (arr.length - arr1.length) };
        for(int i=0;i<arr2.length;i++){
                    System.out.println(arr2[i]+" ");
        }

        reverseAnArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
