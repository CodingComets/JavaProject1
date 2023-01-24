//1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.

package Project1;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Please input integers: ");

        // Scanner class to register user's input
        Scanner myScanner=new Scanner(System.in);

        // Empty array with length of 5
        int[] nums= new int[5];

        // For loop for filling the array with integers based on the array's length
        for(int i=0; i<nums.length; i++){
            nums[i]=myScanner.nextInt();
        }

        // Prints the entire Array
        System.out.println(Arrays.toString(nums));


        // Initialize a variable to incrementally add the elements of the array with a 'for' loop
        int sum=0;
        for(int i :nums){
            sum+= i;
        }

        // Print the sum of the elements in an array
        System.out.println(sum);

    }
}
