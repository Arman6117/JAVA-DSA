package Array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array before reversing");
        for (int number : numbers) {
            System.out.printf(" %d\n ", number);
        }
        reverse(numbers);
        System.out.println("Array after reversing");
        for (int number : numbers) {
            System.out.printf(" %d\n", number);
        }
    }

    public static void reverse(int[] num) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }
}
