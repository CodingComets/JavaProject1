//4) Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
package Project1;

public class task4 {
    public static void main(String[] args) {

        // Initialize a 2D list of integers
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Initialize a simple var "sum" to incrementally add the elements of list
        int sum = 0;

        // Create an initial for loop to iterate though the outer list i.e {list1}.{list2},{list3}
        for (int i = 0; i < intArray.length; i++) {

            // This loop iterate through the inner elements of the list {1,2,3} and adds them to the sum var.
            for (int j = 0; j < intArray[i].length; j++) {
                // Mod division by 2, if remainder is zero, the number is even.
                if(intArray[i][j]%2==0){
                    System.out.println(intArray[i][j]);
                }else{
                    continue;
                }

            }
        }
    }
}
