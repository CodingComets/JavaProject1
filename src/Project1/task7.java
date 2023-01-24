//7)Write a java program to check whether a given number is prime or not?
package Project1;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        int num = 10;
        boolean prime=true;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                prime=false;
            }else{
                prime=true;
            }
        }
        if (prime==true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
    


}
