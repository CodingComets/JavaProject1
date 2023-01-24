//5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
package Project1;

public class task5 {
    public static void main(String[] args) {
        // Initialize a 2D list of integers
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Initialize a simple var "sum" to incrementally add the elements of list
        int sumEven = 0;
        int sumOdd = 0;

        // Creates an initial for loop to iterate though the outer list i.e {list1}.{list2},{list3}
        for (int i = 0; i < intArray.length; i++) {
            // This loop iterate through the inner elements of the list {1,2,3} and adds them to the sum var.
            for (int j = 0; j < intArray[i].length; j++) {
                // Mod division by 2, if remainder is zero, the number is even.
                if(intArray[i][j]%2==0){
                    sumEven+=intArray[i][j];
                }else{
                    sumOdd+=intArray[i][j];
                }

            }
        }
        System.out.println("Even sum: "+sumEven);
        System.out.println("Odd sum: "+sumOdd);
    }
}
