//3) Create a 2D array of integer values. Print the sum of all numbers.

package Project1;

public class task3 {
    public static void main(String[] args) {

        // Initialize a 2D list of integers
        int[][] intArray={{1,2,3},{4,5,6},{7,8,9}};

        // Initialize a simple var "sum" to incrementally add the elements of list
        int sum=0;

        // Create an initial for loop to iterate though the outer list i.e {list1}.{list2},{list3}
        for(int i=0; i<intArray.length; i++){

            // This loop iterates through the inner elements of the list {1,2,3} and adds them to the sum variable
            for(int j=0;j<intArray[i].length; j++){
                sum+=intArray[i][j];
            }
        }

        // Prints the result
        System.out.println(sum);
    }
}
