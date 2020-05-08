import java.util.Scanner;

public class ThemVaoMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 33, 26, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Position to insert: ");
        int position = sc.nextInt();

        if (position < 0 || position > array.length - 1) {
            System.out.println("Can't add to array");
        }
        else {
            System.out.print("The value to insert: ");
            int newValue = sc.nextInt();

            System.out.println("New array after add the value is: ");
            for (int i = 0; i < array.length; i++) {
                if (position == i) {
                    int index;
                    for (index = array.length -1; index > i; index--) {
                        array[index] = array[index - 1];
                    }
                    array[i] = newValue;
                }
                System.out.print(array[i] + "\t");
            }
        }
    }
}
