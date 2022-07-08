package test;
// All zero's at begining and one's at the end.
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,2,1,0,5,0};
        int[] result = new int[arr.length];
        int k=0;
        int zeros = 0;
        int ones = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 0){
                zeros++;
            } else if (arr[i] == 1) {
                ones++;
            }
        }
        // for adding zeros in result array.
        while(zeros > 0){
           result[k] = 0;
            zeros--;
            k++;
        }
        // for adding number not 1 or 0.
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] != 0 && arr[i] != 1){
                result[k] = arr[i];
                k++;
            }
        }
        // for adding 1 at the end of result array.
        while(ones > 0){
            result[k] = 1;
            ones--;
            k++;
        }
        // printing the result array.
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
