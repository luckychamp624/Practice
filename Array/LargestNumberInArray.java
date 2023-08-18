public class LargestNumberInArray {

    public static int largestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 5, 9, 7, 2, 4, 6, 4, 9, 7, 8,24};
        System.out.println("Largest Number of an Array : " + largestNumber(number));
    }
}
