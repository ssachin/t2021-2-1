import java.util.Arrays;
import java.util.Scanner;

/*
 * Program-2
 */

public class Program_2 {

    public static void getSequence(int n) {
        int[] arr = new int[n];
        for (int i=1; i<n+1; i++) {
            if (i==1) {
                arr[i-1] = i;
            } else {
                arr[i-1] = arr[i-2]+2;
            }
        }
        System.out.println("The sequence is : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the integer x : ");
        int x = scn.nextInt();

        getSequence(x);
        scn.close();
    }
}
