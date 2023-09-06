import java.util.Scanner;

class ArrayLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt(System.in);

        int[] array = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Lets search the element: ");
        int searchElemet = scanner.nextInt();

        int foundIndex = linearSearch(array, searchElemet);

        if (foundIndex != -1) {
            System.out.println("Value " + searchElemet + " found at index " + foundIndex);
        } else {
            System.out.println("Value " + searchElemet + " not found in the array.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
