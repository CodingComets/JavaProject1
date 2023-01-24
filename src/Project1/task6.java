//6)Write a program to swap 2 numbers without a temporary variable?
//Source
package Project1;

public class task6 {
    public static void main(String[] args) {

        int num1=5;
        int num2=10;

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        // Swapping the numbers with arithmetic and variable reassignment

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("-----SWAP-----");

        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);




    }
}
