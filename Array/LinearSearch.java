public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 9, 9, 7, 1, 6, 3 };
        int key = 7;
        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Nopt Found!!");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }
}
