//11)Write a program to print out duplicate elements from an Array of Strings?

package Project1;

public class task11 {
    public static void main(String[] args) {
        String[] arr={"abc","bca","abc","cba","bca"};

        for(int i=0; i<arr.length-1; i++){
            //System.out.println(arr[i]);
            for(int j=i+1; j < arr.length; j++){
                if(arr[i].equals(arr[j]) && i!=j){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
