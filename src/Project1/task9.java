//9)Maximum and minimum number in the array?

package Project1;

public class task9 {
    public static void main(String[] args) {
        int[] arr={2,300,100,24,-2,1000,4,277};
        int count = 8;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>count){
                count=arr[i];
            }
        }
        System.out.println(count);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<count){
                count=arr[i];
            }
        }
        System.out.print(count);
    }
}
