//10)Write a java program to find the second-largest number in the array?

package Project1;

public class task10 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 3, 9, 500, 6, 7, 8};
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count1) {
                count1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < count1 && arr[i]> count2) {
                count2 = arr[i];
            }
        }
        System.out.print(count2);
    }
}